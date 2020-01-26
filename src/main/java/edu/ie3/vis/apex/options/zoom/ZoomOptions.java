/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.zoom;

/**
 * Parameterization of zooming in axis charts
 *
 * @version 0.1
 * @since 13.01.20
 */
public class ZoomOptions {

  public static final ZoomOptions DEFAULT_X_WITH_AUTOSCALE =
      new ZoomOptions(true, ZoomType.x, true, ZoomedAreaOptions.TRANSPARENT);

  private final Boolean enabled;
  private final ZoomType type;
  private final boolean autoScaleYaxis;
  private final ZoomedAreaOptions zoomedArea;

  /**
   * Standard constructor for zoom options in axis charts
   *
   * @param enabled enables/disables zooming in axis charts
   * @param type allow zooming either on both x-axis, y-axis or on both axis. Known Issue: In
   *     synchronized charts, xy or y will not update charts in sync, while x will work correctly.
   * @param autoScaleYaxis When this option is turned on, the chart’s y-axis re-scales to a new low
   *     and high based on the visible area. Helpful in situations where the user zoomed in to a
   *     small area to get a better view. Known Issue: This option doesn’t works in a multi-axis
   *     chart (when you have more than 1 y-axis)
   * @param zoomedArea options for the area which is drawn when a user drags the mouse from one
   *     point to another
   */
  public ZoomOptions(
      Boolean enabled, ZoomType type, boolean autoScaleYaxis, ZoomedAreaOptions zoomedArea) {
    this.enabled = enabled;
    this.type = type;
    this.autoScaleYaxis = autoScaleYaxis;
    this.zoomedArea = zoomedArea;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public ZoomType getType() {
    return type;
  }

  public boolean isAutoScaleYaxis() {
    return autoScaleYaxis;
  }

  public ZoomedAreaOptions getZoomedArea() {
    return zoomedArea;
  }
}
