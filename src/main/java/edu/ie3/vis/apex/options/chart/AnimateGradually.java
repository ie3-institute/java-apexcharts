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
 * @since 14.01.20
 */
public class AnimateGradually {

  public static final AnimateGradually DISABLED = new AnimateGradually(false, 0L);

  private final Boolean enabled;
  private final long delay;

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
