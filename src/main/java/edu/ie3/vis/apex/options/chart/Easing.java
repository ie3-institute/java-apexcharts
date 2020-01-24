/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.chart;

/**
 * Easing options for {@link Animations}
 *
 * @version 0.1
 * @since 14.01.20
 */
public enum Easing {
  linear("linear"),
  easein("easein"),
  easeout("easeout"),
  easeinout("easeinout");

  private String id;

  Easing(String id) {
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
