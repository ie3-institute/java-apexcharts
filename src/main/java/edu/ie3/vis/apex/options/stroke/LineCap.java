/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.options.stroke;

/**
 * Setting the starting and ending points of stroke in a line chart.
 *
 * <p>Available Options:
 *
 * <p>butt: ends the stroke with a 90-degree angle square: similar to butt except that it extends
 * the stroke beyond the length of the path round: ends the path-stroke with a radius that smooths
 * out the start and end points
 *
 * @version 0.1
 * @since 14.01.20
 */
public enum LineCap {
  butt("butt"),
  square("square"),
  round("round");

  private String id;

  LineCap(String id) {
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
