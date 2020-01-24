/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.stroke;

/**
 * Parent class of {@link SingleStrokeOptions} and {@link MultiStrokeOptions} to customize strokes
 * of e.g. line charts.
 *
 * <p>See <a href=https://apexcharts.com/docs/options/stroke/>
 * https://apexcharts.com/docs/options/stroke/</a> for parameter details.
 *
 * @version 0.1
 * @since 14.01.20
 */
public abstract class StrokeOptions {

  private final boolean show;
  private final LineCap lineCap;
  private final double width;
  private final int[] dashArray;

  /**
   * Create either a {@link SingleStrokeOptions} or {@link MultiStrokeOptions} object to customize
   * the strokes of a chart
   *
   * @param show show or hide path-stroke / line
   * @param lineCap set the starting and ending points of stroke
   * @param width set the width of border for svg path
   * @param dashArray Creates dashes in borders of svg path. Higher number creates more space
   *     between dashes in the border. Can be a single element array (applies for all strokes) or an
   *     array with elements equals the number of strokes in the chart
   */
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
