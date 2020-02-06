package edu.ie3.vis.apex.data

import edu.ie3.vis.apex.options.chart.AnimateGradually
import edu.ie3.vis.apex.options.chart.Animations
import edu.ie3.vis.apex.options.chart.ChartOptions
import edu.ie3.vis.apex.options.chart.ChartType
import edu.ie3.vis.apex.options.chart.DynamicAnimation
import edu.ie3.vis.apex.options.chart.Easing
import edu.ie3.vis.apex.options.stroke.LineCap
import edu.ie3.vis.apex.options.stroke.LineCurve
import edu.ie3.vis.apex.options.stroke.MultiStrokeOptions
import edu.ie3.vis.apex.options.stroke.SingleStrokeOptions
import edu.ie3.vis.apex.options.title.ChartTitle
import edu.ie3.vis.apex.options.title.TextAlignment
import edu.ie3.vis.apex.options.xaxis.XAxisOptions
import edu.ie3.vis.apex.options.xaxis.XAxisType
import edu.ie3.vis.apex.options.zoom.ZoomOptions
import edu.ie3.vis.apex.options.zoom.ZoomType
import edu.ie3.vis.apex.options.zoom.ZoomedAreaFill
import edu.ie3.vis.apex.options.zoom.ZoomedAreaOptions
import edu.ie3.vis.apex.options.zoom.ZoomedAreaStroke
import spock.lang.Specification

import java.awt.Color

class OptionsTest extends Specification {

    def "test all chart options"() {

        ChartOptions testChart = new ChartOptions(
                typeInput,
                stackedInput,
                heightInput,
                ZoomOptions.DEFAULT_X_WITH_AUTOSCALE,
                new Animations(animationInput, easingInput, speedInput , animateGraduallyInput),
                new DynamicAnimation(dynInput, dynSpeedInput))


        expect: "get the right options"

        testChart.getType().toString() == typeOutput
        testChart.getStacked().toString() == stackedOutput
        testChart.getHeight().toString() == heightOutput
        testChart.getAnimations().getEnabled().toString() == animationOutput
        testChart.getAnimations().getEasing().toString() == easingOutput
        testChart.getAnimations().getSpeed().toString() == speedOutput
        testChart.getAnimations().getAnimateGradually().getEnabled().toString() == graduallyOutput
        testChart.getAnimations().getAnimateGradually().getDelay().toString() == delayOutput
        testChart.getDynamicAnimation().getEnabled().toString() == dynOutput
        testChart.getDynamicAnimation().getSpeed().toString() == dynSpeedOutput


        where:

        typeInput               | stackedInput  | heightInput   | animationInput    | easingInput       | speedInput    | animateGraduallyInput                     | dynInput  | dynSpeedInput || typeOutput       | stackedOutput | heightOutput  | animationOutput   | easingOutput  | speedOutput   | graduallyOutput   | delayOutput   | dynOutput | dynSpeedOutput
        ChartType.line          | false         | 750           | false             | Easing.linear     | 400L          | AnimateGradually.DISABLED                 | false     | 0L            || "line"           | "false"       | "750px"       | "false"           | "linear"      | "400"         | "false"           | "0"           | "false"   | "0"
        ChartType.area          | false         | 750           | false             | Easing.easein     | 700L          | AnimateGradually.ENABLED_DEFAULT_VALUES   | true      | 300L          || "area"           | "false"       | "750px"       | "false"           | "easein"      | "700"         | "true"            | "150"         | "true"    | "300"
        ChartType.bar           | false         | 750           | false             | Easing.easeinout  | 500L          | new AnimateGradually(true, 200L)          | true      | 50L           || "bar"            | "false"       | "750px"       | "false"           | "easeinout"   | "500"         | "true"            | "200"         | "true"    | "50"
        ChartType.bubble        | false         | 750           | true              | Easing.easeout    | 500L          | new AnimateGradually(false, 10L)          | true      | 2L            || "bubble"         | "false"       | "750px"       | "true"            | "easeout"     | "500"         | "false"           | "10"          | "true"    | "2"
        ChartType.candlestick   | false         | 750           | true              | Easing.easeout    | 700L          | AnimateGradually.DISABLED                 | false     | 0L            || "candlestick"    | "false"       | "750px"       | "true"            | "easeout"     | "700"         | "false"           | "0"           | "false"   | "0"
        ChartType.donut         | true          | 750           | false             | Easing.linear     | 500L          | AnimateGradually.DISABLED                 | false     | 0L            || "donut"          | "true"        | "750px"       | "false"           | "linear"      | "500"         | "false"           | "0"           | "false"   | "0"
        ChartType.heatmap       | true          | 550           | true              | Easing.easeinout  | 800L          | AnimateGradually.DISABLED                 | false     | 0L            || "heatmap"        | "true"        | "550px"       | "true"            | "easeinout"   | "800"         | "false"           | "0"           | "false"   | "0"
        ChartType.histogram     | true          | 550           | false             | Easing.linear     | 500L          | AnimateGradually.DISABLED                 | false     | 0L            || "histogram"      | "true"        | "550px"       | "false"           | "linear"      | "500"         | "false"           | "0"           | "false"   | "0"
        ChartType.pie           | true          | 550           | false             | Easing.easeout    | 500L          | AnimateGradually.DISABLED                 | false     | 0L            || "pie"            | "true"        | "550px"       | "false"           | "easeout"     | "500"         | "false"           | "0"           | "false"   | "0"
        ChartType.radar         | false         | 550           | true              | Easing.easein     | 700L          | AnimateGradually.DISABLED                 | false     | 0L            || "radar"          | "false"       | "550px"       | "true"            | "easein"      | "700"         | "false"           | "0"           | "false"   | "0"
        ChartType.radialBar     | true          | 550           | true              | Easing.linear     | 500L          | AnimateGradually.DISABLED                 | false     | 0L            || "radialBar"      | "true"        | "550px"       | "true"            | "linear"      | "500"         | "false"           | "0"           | "false"   | "0"
        ChartType.scatter       | false         | 550           | true              | Easing.easeinout  | 400L          | AnimateGradually.DISABLED                 | false     | 0L            || "scatter"        | "false"       | "550px"       | "true"            | "easeinout"   | "400"         | "false"           | "0"           | "false"   | "0"

    }

    def "test all stroke options"() {

        SingleStrokeOptions testSingleStroke = new SingleStrokeOptions(
                showInput,
                LineCurveInput,
                LineCapInput,
                1,
                0)

        MultiStrokeOptions testMultiStroke = new MultiStrokeOptions(
                showInput,
                MultiLineCurveInput,
                LineCapInput,
                1,
                0)


        expect: "get the right options"

        testSingleStroke.isShow().toString() == showOutput
        testSingleStroke.getCurve().getId() == LineCurveOutput
        testSingleStroke.getLineCap().toString() == LineCapOutput

        testSingleStroke.getWidth().toString() == "1.0"
        testSingleStroke.getDashArray().toString() == "[0]"

        testMultiStroke.isShow().toString() == showOutput
        testMultiStroke.getCurve().toString() == MultiLineCurveOutput
        testMultiStroke.getLineCap().toString() == LineCapOutput


        where:

        showInput   | LineCurveInput           | MultiLineCurveInput    | LineCapInput      || showOutput       | LineCurveOutput   | MultiLineCurveOutput  | LineCapOutput
        true        | LineCurve.smooth         | [LineCurve.smooth]     | LineCap.butt      || "true"           | "smooth"          | "[smooth]"            | "butt"
        false       | LineCurve.straight       | [LineCurve.straight]   | LineCap.round     || "false"          | "straight"        | "[straight]"          | "round"
        true        | LineCurve.stepline       | [LineCurve.stepline]   | LineCap.square    || "true"           | "stepline"        | "[stepline]"          | "square"
    }

    def "test all title options"() {

        ChartTitle testTitle = new ChartTitle(
                "TestTitle",
                TextAlignment.center,
                15,
                50,
                50,
                true
        )


        expect: "get the right options"

        testTitle.getText() == "TestTitle"
        testTitle.getAlign().toString() == "center"
        testTitle.getMargin().toString() == "15"
        testTitle.getOffsetX().toString() == "50"
        testTitle.getOffsetY().toString() == "50"
        testTitle.isFloating().toString() == "true"

    }

    def "test all xaxis options"() {

        XAxisOptions testXAxisOptions = new XAxisOptions(
                typeInput,
                categoriesInput
        )

        XAxisOptions testXAxisOptionsType = new XAxisOptions(
                typeInput
        )


        expect: "get the right options"

        testXAxisOptions.getType().getId() == typeOutput
        testXAxisOptions.getCategories().toString() == categoriesOutput

        testXAxisOptionsType.getType().getId() == typeOutput


        where:

        typeInput           | categoriesInput   || typeOutput   | categoriesOutput
        XAxisType.category  | []                || "category"   | "[]"
        XAxisType.datetime  | []                || "datetime"   | "[]"
        XAxisType.numeric   | []                || "numeric"    | "[]"


    }

    def "test all zoom options"() {

        ZoomOptions testZoom = new ZoomOptions(
                enabledInput,
                typeInput,
                autoScaleInput,
                new ZoomedAreaOptions(zoomedAreaFillInput, zoomedAreaStrokeInput)
        )


        expect: "get the right options"

        testZoom.getEnabled().toString() == enabledOutput
        testZoom.getType().getId() == typeOutput
        testZoom.isAutoScaleYaxis().toString() == autoScaleOutput

        testZoom.getZoomedArea().getFill().getColor().toString() == fillColor
        testZoom.getZoomedArea().getFill().getOpacity().toString() == fillOpacity
        testZoom.getZoomedArea().getStroke().getOpacity().toString() == strokeOpacity
        testZoom.getZoomedArea().getStroke().getColor().toString() == strokeColor
        testZoom.getZoomedArea().getStroke().getWidth().toString() == strokeWidth



        where:

        enabledInput    | typeInput     | autoScaleInput    | zoomedAreaFillInput                   | zoomedAreaStrokeInput                         || enabledOutput    | typeOutput    | autoScaleOutput   | fillColor | fillOpacity   | strokeOpacity | strokeColor   | strokeWidth
        true            | ZoomType.x    | true              | new ZoomedAreaFill(Color.cyan, 1.0)   | new ZoomedAreaStroke(Color.pink, 0.6, 300)    || "true"           | "x"           | "true"            | "#00ffff" | "1.0"         | "0.6"         | "#ffafaf"     | "300"
        false           | ZoomType.y    | true              | ZoomedAreaFill.TRANSPARENT            | ZoomedAreaStroke.TRANSPARENT                  || "false"          | "y"           | "true"            | "#ffffff" | "0.0"         | "0.0"         | "#ffffff"     | "0"
        false           | ZoomType.xy   | false             | new ZoomedAreaFill(Color.green, 0.4)  | new ZoomedAreaStroke(Color.yellow, 1.0, 2000) || "false"          | "xy"          | "false"           | "#00ff00" | "0.4"         | "1.0"         | "#ffff00"     | "2000"


    }

}
