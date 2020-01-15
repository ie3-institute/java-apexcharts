/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.chart;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 13.01.20
 */
public class ChartOptions {

  private final ChartType type;
  private final Boolean stacked;
  private final int height;
  private final ZoomOptions zoom;
  private final Animations animations;
  private final DynamicAnimation dynamicAnimation;

  public ChartOptions(
      ChartType type,
      Boolean stacked,
      int height,
      ZoomOptions zoom,
      Animations animations,
      DynamicAnimation dynamicAnimation) {
    this.type = type;
    this.stacked = stacked;
    this.height = height;
    this.zoom = zoom;
    this.animations = animations;
    this.dynamicAnimation = dynamicAnimation;
  }

  /**
   * Disabled dynamic animations
   *
   * @param type
   * @param stacked
   * @param height
   * @param zoom
   * @param animations
   */
  public ChartOptions(
      ChartType type, Boolean stacked, int height, ZoomOptions zoom, Animations animations) {
    this(type, stacked, height, zoom, animations, new DynamicAnimation(false, 0L));
  }

  public ChartType getType() {
    return type;
  }

  public Boolean getStacked() {
    return stacked;
  }

  public int getHeight() {
    return height;
  }

  public ZoomOptions getZoom() {
    return zoom;
  }

  public Animations getAnimations() {
    return animations;
  }

  public DynamicAnimation getDynamicAnimation() {
    return dynamicAnimation;
  }
}
