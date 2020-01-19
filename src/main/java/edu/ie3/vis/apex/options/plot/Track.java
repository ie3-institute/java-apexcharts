/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.plot;

import static edu.ie3.vis.apex.util.ApexUtil.rgbToHex;

import java.awt.*;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 19.01.20
 */
public class Track {

  private final boolean show;
  private final int startAngle;
  private final int endAngle;
  private final String background;
  private final String strokeWidth;
  private final double opacity;
  private final int margin;
  private final DropShadow dropShadow;

  public Track(
      boolean show,
      int startAngle,
      int endAngle,
      Color background,
      int strokeWidth,
      double opacity,
      int margin,
      DropShadow dropShadow) {
    this.show = show;
    this.startAngle = startAngle;
    this.endAngle = endAngle;
    this.background = rgbToHex(background);
    this.strokeWidth = Integer.toString(strokeWidth).concat("%");
    this.opacity = opacity;
    this.margin = margin;
    this.dropShadow = dropShadow;
  }

  public boolean isShow() {
    return show;
  }

  public int getStartAngle() {
    return startAngle;
  }

  public int getEndAngle() {
    return endAngle;
  }

  public String getBackground() {
    return background;
  }

  public String getStrokeWidth() {
    return strokeWidth;
  }

  public double getOpacity() {
    return opacity;
  }

  public int getMargin() {
    return margin;
  }

  public DropShadow getDropShadow() {
    return dropShadow;
  }
}
