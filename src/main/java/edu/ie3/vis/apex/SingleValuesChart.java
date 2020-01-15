/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex;

import edu.ie3.vis.apex.data.PairDataSeries;
import edu.ie3.vis.apex.data.SingleDataSeries;
import edu.ie3.vis.apex.data.Tuple2;
import edu.ie3.vis.apex.options.chart.ChartOptions;
import edu.ie3.vis.apex.options.stroke.StrokeOptions;
import edu.ie3.vis.apex.options.title.ChartTitle;
import edu.ie3.vis.apex.options.xaxis.XAxisOptions;
import edu.ie3.vis.apex.options.xaxis.XAxisType;
import java.util.*;
import java.util.stream.Collectors;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 14.01.20
 */
public class SingleValuesChart extends ApexChart {

  private final List<SingleDataSeries> series;
  private final XAxisOptions xaxis;

  public SingleValuesChart(
      ChartTitle title,
      List<SingleDataSeries> series,
      ChartOptions chart,
      XAxisOptions xaxis,
      StrokeOptions strokeOptions) {
    super(title, chart, strokeOptions);
    this.xaxis = xaxis;
    this.series = series;
  }

  public SingleValuesChart(
      ChartTitle title,
      Collection<PairDataSeries<String, Double>> series,
      ChartOptions chart,
      StrokeOptions strokeOptions) {
    super(title, chart, strokeOptions);

    // convert the pairs to single elements and add corresponding x-axis categories
    Map<List<String>, List<SingleDataSeries>> xyVals = convertPairDataSeries(series);
    this.xaxis = new XAxisOptions(XAxisType.category, xyVals.keySet().iterator().next());
    this.series = xyVals.get(xyVals.keySet().iterator().next());
  }

  private Map<List<String>, List<SingleDataSeries>> convertPairDataSeries(
      Collection<PairDataSeries<String, Double>> series) {
    Map<List<String>, List<SingleDataSeries>> result = new LinkedHashMap<>();
    series.forEach(
        pairDataSeries -> {
          Collections.sort(pairDataSeries.getData()); // sort the data
          LinkedList<Double> yValues =
              pairDataSeries.getData().stream()
                  .map(Tuple2::getY)
                  .collect(Collectors.toCollection(LinkedList::new));
          LinkedList<String> xValues =
              pairDataSeries.getData().stream()
                  .map(Tuple2::getX)
                  .collect(Collectors.toCollection(LinkedList::new));
          SingleDataSeries singleDataSeries =
              new SingleDataSeries(pairDataSeries.getName(), yValues);
          result.putIfAbsent(xValues, new ArrayList<>());
          if (result.containsKey(xValues)) {
            result.get(xValues).add(singleDataSeries);
          } else {
            throw new RuntimeException(
                "Invalid data provided! Provided y values needs to be the same for all series!");
          }
        });

    return result;
  }

  public List<SingleDataSeries> getSeries() {
    return series;
  }

  public XAxisOptions getXaxis() {
    return xaxis;
  }
}
