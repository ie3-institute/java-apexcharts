/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.title;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 13.01.20
 */
public enum TextAlignment {
  left("left"),
  center("center"),
  right("right");

  private String id;

  TextAlignment(String id) {
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
