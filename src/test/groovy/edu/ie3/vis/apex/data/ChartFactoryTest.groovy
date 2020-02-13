package edu.ie3.vis.apex.data

import edu.ie3.vis.apex.ChartFactory
import edu.ie3.vis.apex.PairedValuesChart
import edu.ie3.vis.apex.exceptions.ApexChartsException
import edu.ie3.vis.apex.options.chart.AnimateGradually
import edu.ie3.vis.apex.options.chart.Animations
import edu.ie3.vis.apex.options.chart.ChartOptions
import edu.ie3.vis.apex.options.chart.ChartType
import edu.ie3.vis.apex.options.chart.Easing
import edu.ie3.vis.apex.options.stroke.SingleStrokeOptions
import edu.ie3.vis.apex.options.title.ChartTitle
import edu.ie3.vis.apex.options.xaxis.XAxisOptions
import edu.ie3.vis.apex.options.zoom.ZoomOptions
import spock.lang.Specification

import java.nio.file.Files
import java.nio.file.Paths

class ChartFactoryTest extends Specification {


    def "ChartFactory should create a valid html file"() {
        given: "Graph data"

        ArrayList<PairDataSeries<String, Double>> testSeries = []

        ArrayList<Tuple2<String, Double>> testDataList = []

        Tuple2<String, Double> data =
                new Tuple2<>("2020-01-30 00:00", 1)

        testDataList.add(data)


        Collections.sort(testDataList)
        PairDataSeries<String, Double> testDataSeries = new PairDataSeries<>("TestData", testDataList)
        testSeries.add(testDataSeries)


        ChartFactory testChartFactory = new ChartFactory()
        testChartFactory.createSingleValuesChart(
                new ChartTitle("TestChart"),
                testSeries,
                new ChartOptions(
                        ChartType.line,
                        false,
                        550,
                        ZoomOptions.DEFAULT_X_WITH_AUTOSCALE,
                        new Animations(true, Easing.linear, 500L, AnimateGradually.DISABLED)),
                SingleStrokeOptions.DEFAULT,
                "src/test/resources/graphs/test/testChart.html")

        expect: "created testChart html should match the given data"
        String testChart = new String(Files.readAllBytes(Paths.get("src/test/resources/graphs/test/testChart.html")))
        String compareChart = new String(Files.readAllBytes(Paths.get("src/test/resources/graphs/compareChart.html")))

        testChart == compareChart

    }

    def "test throws ApexChartsException (if PairedValuesChart.ChartType == line)"() {
        given: "graph data"
        ArrayList<PairDataSeries<String, Double>> testSeries = []

        ArrayList<Tuple2<String, Double>> testDataList = []

        Tuple2<String, Double> data =
                new Tuple2<>("2020-01-30 00:00", 1)

        testDataList.add(data)


        Collections.sort(testDataList)
        PairDataSeries<String, Double> testDataSeries = new PairDataSeries<>("TestData", testDataList)
        testSeries.add(testDataSeries)

        when:
        new PairedValuesChart(
                testSeries,
                new ChartOptions(
                ChartType.line,
                false,
                550,
                ZoomOptions.DEFAULT_X_WITH_AUTOSCALE,
                new Animations(true, Easing.linear, 500L, AnimateGradually.DISABLED)),
                new ChartTitle("TestChart"),
                XAxisOptions.DEFAULT,
                SingleStrokeOptions.DEFAULT)


        then: thrown ApexChartsException

    }

}
