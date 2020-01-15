/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.stroke;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 14.01.20
 */
public abstract class StrokeOptions {

  private final boolean show;
  private final LineCap lineCap;
  private final double width;
  private final int[] dashArray;

  public StrokeOptions(boolean show, LineCap lineCap, double width, int[] dashArray) {
    this.show = show;
    this.lineCap = lineCap;
    this.width = width;
    this.dashArray = dashArray;
  }

  public boolean isShow() {
    return show;
  }

  public LineCap getLineCap() {
    return lineCap;
  }

  public double getWidth() {
    return width;
  }

  public int[] getDashArray() {
    return dashArray;
  }
}
