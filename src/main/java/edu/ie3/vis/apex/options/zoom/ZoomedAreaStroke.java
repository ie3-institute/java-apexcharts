/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.options.zoom;

import static edu.ie3.vis.apex.util.ApexUtil.rgbToHex;

import java.awt.*;

/**
 * Stroke options for {@link ZoomedAreaOptions}
 *
 * @version 0.1
 * @since 21.01.20
 */
public class ZoomedAreaStroke {

  public static final ZoomedAreaStroke TRANSPARENT = new ZoomedAreaStroke(Color.WHITE, 0.0, 0);

  private final String color;
  private final double opacity;
  private final int width;

  /**
   * Standard constructor for stroke options of {@link ZoomedAreaOptions}
   *
   * @param color border color of the selection zoomed area
   * @param opacity the transparency level of the selection border
   * @param width the width selection border
   */
  public ZoomedAreaStroke(Color color, double opacity, int width) {
    this.color = rgbToHex(color);
    this.opacity = opacity;
    this.width = width;
  }

  public String getColor() {
    return color;
  }

  public double getOpacity() {
    return opacity;
  }

  public int getWidth() {
    return width;
  }
}
