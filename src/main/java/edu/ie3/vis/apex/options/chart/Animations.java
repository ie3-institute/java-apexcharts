/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.chart;

/**
 * //ToDo: Class Description https://apexcharts.com/docs/options/chart/animations/
 *
 * @version 0.1
 * @since 14.01.20
 */
public class Animations {

  private final Boolean enabled;
  private final Easing easing;
  private final Long speed;
  private final AnimateGradually animateGradually;

  public Animations(Boolean enabled, Easing easing, Long speed, AnimateGradually animateGradually) {
    this.enabled = enabled;
    this.easing = easing;
    this.speed = speed;
    this.animateGradually = animateGradually;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public Easing getEasing() {
    return easing;
  }

  public Long getSpeed() {
    return speed;
  }

  public AnimateGradually getAnimateGradually() {
    return animateGradually;
  }
}
