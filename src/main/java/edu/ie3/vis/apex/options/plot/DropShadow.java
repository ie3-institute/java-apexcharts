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
public class DropShadow {

  private final boolean enabled;
  private final int top;
  private final int left;
  private final int blur;
  private final double opacity;

  public DropShadow(boolean enabled, int top, int left, int blur, double opacity) {
    this.enabled = enabled;
    this.top = top;
    this.left = left;
    this.blur = blur;
    this.opacity = opacity;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public int getTop() {
    return top;
  }

  public int getLeft() {
    return left;
  }

  public int getBlur() {
    return blur;
  }

  public double getOpacity() {
    return opacity;
  }
}
