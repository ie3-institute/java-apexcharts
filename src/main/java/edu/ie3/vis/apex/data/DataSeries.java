/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.data;

import edu.ie3.vis.apex.options.chart.ChartType;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 14.01.20
 */
abstract class DataSeries {

  private final String name;
  private final ChartType type;

  public DataSeries(String name, ChartType type) {
    this.name = name;
    this.type = type;
  }

  public ChartType getType() {
    return type;
  }

  public String getName() {
    return name;
  }
}
