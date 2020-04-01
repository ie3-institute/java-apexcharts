/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex;

import edu.ie3.vis.apex.data.PairDataSeries;
import edu.ie3.vis.apex.exceptions.ApexChartsException;
import edu.ie3.vis.apex.options.chart.ChartOptions;
import edu.ie3.vis.apex.options.chart.ChartType;
import edu.ie3.vis.apex.options.stroke.StrokeOptions;
import edu.ie3.vis.apex.options.title.ChartTitle;
import edu.ie3.vis.apex.options.xaxis.XAxisOptions;
import java.util.List;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 13.01.20
 */
public class PairedValuesChart<X extends Comparable<X>, Y extends Comparable<Y>> extends ApexChart {

  private final List<PairDataSeries<X, Y>> series;
  private final XAxisOptions xaxis;

  public PairedValuesChart(
      List<PairDataSeries<X, Y>> series,
      ChartOptions chartOptions,
      ChartTitle title,
      XAxisOptions xaxis,
      StrokeOptions strokeOptions)
      throws ApexChartsException {
    super(title, chartOptions, strokeOptions);

    if (chartOptions.getType().equals(ChartType.line)) {
      throw new ApexChartsException(
          "Provision of paired values is not supported for chart type"
              + ChartType.line
              + " at the moment. And btw it also looks awful! "
              + "Use single values chart and x-axis categories instead!");
    }

    this.series = series;
    this.xaxis = xaxis;
  }

  public List<PairDataSeries<X, Y>> getSeries() {
    return series;
  }

  public XAxisOptions getXaxis() {
    return xaxis;
  }
}
