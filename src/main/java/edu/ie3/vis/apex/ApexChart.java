/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex;

import edu.ie3.vis.apex.options.chart.ChartOptions;
import edu.ie3.vis.apex.options.stroke.StrokeOptions;
import edu.ie3.vis.apex.options.title.ChartTitle;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 14.01.20
 */
public abstract class ApexChart {

  private final ChartTitle title;
  private final ChartOptions chart;
  private final StrokeOptions stroke;

  public ApexChart(ChartTitle title, ChartOptions chart, StrokeOptions strokeOptions) {
    this.title = title;
    this.chart = chart;
    this.stroke = strokeOptions;
  }

  public ChartOptions getChart() {
    return chart;
  }

  public ChartTitle getTitle() {
    return title;
  }

  public StrokeOptions getStroke() {
    return stroke;
  }
}
