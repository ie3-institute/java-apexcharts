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
public class RadialBar {

  private final boolean inverseOrder;
  private final int startAngle;
  private final int endAngle;
  private final int offsetX;
  private final int offsetY;
  private final Hollow hollow;

  public RadialBar(
      boolean inverseOrder, int startAngle, int endAngle, int offsetX, int offsetY, Hollow hollow) {
    this.inverseOrder = inverseOrder;
    this.startAngle = startAngle;
    this.endAngle = endAngle;
    this.offsetX = offsetX;
    this.offsetY = offsetY;
    this.hollow = hollow;
  }

  public boolean isInverseOrder() {
    return inverseOrder;
  }

  public int getStartAngle() {
    return startAngle;
  }

  public int getEndAngle() {
    return endAngle;
  }

  public int getOffsetX() {
    return offsetX;
  }

  public int getOffsetY() {
    return offsetY;
  }

  public Hollow getHollow() {
    return hollow;
  }
}
