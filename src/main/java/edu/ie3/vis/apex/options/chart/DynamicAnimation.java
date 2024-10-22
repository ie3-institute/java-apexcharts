/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.options.chart;

/**
 * Allows the configuration of the animation when data is changed and chart is re-rendered
 *
 * @version 0.1
 * @since 14.01.20
 */
public class DynamicAnimation {

  private final Boolean enabled;
  private final long speed;

  /**
   * Standard constructor for dynamic animation
   *
   * @param enabled enable or disable dynamic animation
   * @param speed defines the speed at which dynamic animation runs whenever data changes
   */
  public DynamicAnimation(Boolean enabled, long speed) {
    this.enabled = enabled;
    this.speed = speed;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public long getSpeed() {
    return speed;
  }
}
