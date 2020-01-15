/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.stroke;

import java.util.List;

/**
 * //ToDo: Class Description https://apexcharts.com/docs/options/stroke/
 *
 * @version 0.1
 * @since 14.01.20
 */
public class MultiStrokeOptions extends StrokeOptions {

  private final List<LineCurve> curve;

  public MultiStrokeOptions(
      boolean show, List<LineCurve> curve, LineCap lineCap, double width, int[] dashArray) {
    super(show, lineCap, width, dashArray);
    this.curve = curve;
  }

  public List<LineCurve> getCurve() {
    return curve;
  }
}
