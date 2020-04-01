/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex;

/**
 * Wrapper holding information about the created chart. This includes the base POJO as well as the
 * resulting 'ready-to-be-written' chart string as well as some meta information.
 *
 * @version 0.1
 * @since 10.02.20
 */
public class JApexChart {

  private final ApexChart apexChart;
  private final String apexChartString;

  public JApexChart(ApexChart apexChart, String apexChartString) {
    this.apexChart = apexChart;
    this.apexChartString = apexChartString;
  }

  public ApexChart getApexChart() {
    return apexChart;
  }

  public String getApexChartString() {
    return apexChartString;
  }
}
