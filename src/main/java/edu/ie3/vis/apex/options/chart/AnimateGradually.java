/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.options.chart;

/**
 * Gradually animate one by one every data in the series instead of animating all at once
 *
 * @version 0.1
 * @since 14.01.20
 */
public class AnimateGradually {

  /** Animate Gradually disabled */
  public static final AnimateGradually DISABLED = new AnimateGradually(false, 0L);

  /** Animate Gradually enabled with default delay */
  public static final AnimateGradually ENABLED_DEFAULT_VALUES = new AnimateGradually(true, 150L);

  private final Boolean enabled;
  private final long delay;

  /**
   * Gradually animate one by one every data in the series instead of animating all at once. If
   * {@link Animations} is disabled providing this parameter has no effect!
   *
   * @param enabled enable or disable gradual animation
   * @param delay speed at which gradual (one by one) animation runs
   */
  public AnimateGradually(Boolean enabled, long delay) {
    this.enabled = enabled;
    this.delay = delay;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public long getDelay() {
    return delay;
  }
}
