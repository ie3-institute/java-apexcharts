/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.data;

import java.util.List;

/**
 * Representation of a data series with double values
 *
 * @version 0.1
 * @since 14.01.20
 */
public class SingleDataSeries {

  private final String name;
  private final List<Double> data;

  public SingleDataSeries(String name, List<Double> data) {
    this.name = name;
    this.data = data;
  }

  public String getName() {
    return name;
  }

  public List<Double> getData() {
    return data;
  }
}
