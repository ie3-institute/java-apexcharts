/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.plot;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 19.01.20
 */
public enum Position {
  front("front"),
  back("back");

  private String id;

  Position(String id) {
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
