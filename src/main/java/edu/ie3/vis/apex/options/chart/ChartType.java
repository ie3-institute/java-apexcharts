/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.options.chart;

/**
 * Specifies the type of the chart
 *
 * @version 0.1
 * @since 13.01.20
 */
public enum ChartType {
  area("area"),
  line("line"),
  bar("bar"),
  radar("radar"),
  histogram("histogram"),
  pie("pie"),
  donut("donut"),
  radialBar("radialBar"),
  scatter("scatter"),
  bubble("bubble"),
  heatmap("heatmap"),
  candlestick("candlestick");

  private String id;

  ChartType(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return id;
  }
}
