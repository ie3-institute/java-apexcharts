/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.stroke;

/**
 * //ToDo: Class Description
 *
 * <p>https://apexcharts.com/docs/options/stroke/
 *
 * @version 0.1
 * @since 14.01.20
 */
public class SingleStrokeOptions extends StrokeOptions {

  public static SingleStrokeOptions DEFAULT =
      new SingleStrokeOptions(true, LineCap.butt, 2, new int[] {0}, LineCurve.smooth);

  private final LineCurve curve;

  public SingleStrokeOptions(
      boolean show, LineCap lineCap, double width, int[] dashArray, LineCurve curve) {
    super(show, lineCap, width, dashArray);
    this.curve = curve;
  }

  public LineCurve getCurve() {
    return curve;
  }
}
