/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.options.zoom;

/**
 * Options to be set for a zoomed area in axis charts. The zoomed area is the area which is drawn
 * when a user drags the mouse from one point to another. Also see
 * https://apexcharts.com/docs/options/chart/zoom/ for details
 *
 * @version 0.1
 * @since 21.01.20
 */
public class ZoomedAreaOptions {

  public static final ZoomedAreaOptions TRANSPARENT =
      new ZoomedAreaOptions(ZoomedAreaFill.TRANSPARENT, ZoomedAreaStroke.TRANSPARENT);

  private final ZoomedAreaFill fill;
  private final ZoomedAreaStroke stroke;

  /**
   * Standard constructor to parameterize zoomed area in axis charts
   *
   * @param fill zoomed area fill options, see {@link ZoomedAreaFill} for details
   * @param stroke zoomed are stroke options, see {@link ZoomedAreaStroke} for details
   */
  public ZoomedAreaOptions(ZoomedAreaFill fill, ZoomedAreaStroke stroke) {
    this.fill = fill;
    this.stroke = stroke;
  }

  public ZoomedAreaFill getFill() {
    return fill;
  }

  public ZoomedAreaStroke getStroke() {
    return stroke;
  }
}
