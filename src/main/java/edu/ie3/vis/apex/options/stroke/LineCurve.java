/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.stroke;

/**
 * Whether to draw smooth lines or straight lines in line / area charts.
 *
 * <p>Available Options:
 *
 * <p>smooth: connects the points in a curve fashion. Also known as spline straight: connect the
 * points in straight lines. stepline: points are connected by horizontal and vertical line
 * segments, looking like steps of a staircase.
 *
 * @version 0.1
 * @since 14.01.20
 */
public enum LineCurve {
  smooth("smooth"),
  straight("straight"),
  stepline("stepline");

  private String id;

  LineCurve(String id) {
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
