package edu.ie3.vis.apex.data

import edu.ie3.vis.apex.options.chart.AnimateGradually
import edu.ie3.vis.apex.options.chart.Animations
import edu.ie3.vis.apex.options.chart.ChartType
import edu.ie3.vis.apex.options.chart.Easing
import edu.ie3.vis.apex.options.zoom.ZoomOptions
import spock.lang.Specification

class ChartOptions extends Specification {

    def "test all chart options"() {

        edu.ie3.vis.apex.options.chart.ChartOptions testChart = new edu.ie3.vis.apex.options.chart.ChartOptions(
                typeInput,
                stackedInput,
                heightInput,
                ZoomOptions.DEFAULT_X_WITH_AUTOSCALE,
                new Animations(animationInput, easingInput, speedInput , AnimateGradually.DISABLED))


        expect: "get the right options"

        testChart.type.toString() == typeOutput
        testChart.stacked.toString() == stackedOutput
        testChart.height.toString() == heightOutput
        testChart.animations.enabled.toString() == animationOutput
        testChart.animations.easing.toString() == easingOutput
        testChart.animations.speed.toString() == speedOutput


        where:

        typeInput               | stackedInput  | heightInput   | animationInput    | easingInput       | speedInput    || typeOutput       | stackedOutput | heightOutput  | animationOutput   | easingOutput  | speedOutput
        ChartType.line          | false         | 750           | false             | Easing.linear     | 400L          || "line"           | "false"       | "750px"       | "false"           | "linear"      | "400"
        ChartType.area          | false         | 750           | false             | Easing.easein     | 700L          || "area"           | "false"       | "750px"       | "false"           | "easein"      | "700"
        ChartType.bar           | false         | 750           | false             | Easing.easeinout  | 500L          || "bar"            | "false"       | "750px"       | "false"           | "easeinout"   | "500"
        ChartType.bubble        | false         | 750           | true              | Easing.easeout    | 500L          || "bubble"         | "false"       | "750px"       | "true"            | "easeout"     | "500"
        ChartType.candlestick   | false         | 750           | true              | Easing.easeout    | 700L          || "candlestick"    | "false"       | "750px"       | "true"            | "easeout"     | "700"
        ChartType.donut         | true          | 750           | false             | Easing.linear     | 500L          || "donut"          | "true"        | "750px"       | "false"           | "linear"      | "500"
        ChartType.heatmap       | true          | 550           | true              | Easing.easeinout  | 800L          || "heatmap"        | "true"        | "550px"       | "true"            | "easeinout"   | "800"
        ChartType.histogram     | true          | 550           | false             | Easing.linear     | 500L          || "histogram"      | "true"        | "550px"       | "false"           | "linear"      | "500"
        ChartType.pie           | true          | 550           | false             | Easing.easeout    | 500L          || "pie"            | "true"        | "550px"       | "false"           | "easeout"     | "500"
        ChartType.radar         | false         | 550           | true              | Easing.easein     | 700L          || "radar"          | "false"       | "550px"       | "true"            | "easein"      | "700"
        ChartType.radialBar     | true          | 550           | true              | Easing.linear     | 500L          || "radialBar"      | "true"        | "550px"       | "true"            | "linear"      | "500"
        ChartType.scatter       | false         | 550           | true              | Easing.easeinout  | 400L          || "scatter"        | "false"       | "550px"       | "true"            | "easeinout"   | "400"

    }




}
