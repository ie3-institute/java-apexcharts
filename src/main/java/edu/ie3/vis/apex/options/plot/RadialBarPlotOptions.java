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
public class RadialBarPlotOptions implements PlotOptions {

  private final RadialBar radialBar;
  private final Track               track;
  private final RadialBarDataLabels dataLabels;

  public RadialBarPlotOptions(RadialBar radialBar, Track track, RadialBarDataLabels dataLabels) {
    this.radialBar = radialBar;
    this.track = track;
    this.dataLabels = dataLabels;
  }

  public RadialBar getRadialBar() {
    return radialBar;
  }

  public Track getTrack() {
    return track;
  }

  public RadialBarDataLabels getDataLabels() {
    return dataLabels;
  }
}
