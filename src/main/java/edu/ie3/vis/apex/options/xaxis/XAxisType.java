/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.options.xaxis;

/**
 * Types of xaxises that are supported
 *
 * @version 0.1
 * @since 14.01.20
 */
public enum XAxisType {
  category("category"),
  datetime("datetime"),
  numeric("numeric");

  private String id;

  XAxisType(String id) {
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
