/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.stroke;

import java.util.List;

/**
 * Options to configure the stroke of e.g. a line chart. This class should always be used if two or
 * more strokes should look different with regard to the {@link LineCurve}. If a chart with multiple
 * lines is used where all strokes should look the same with regard to the {@link LineCurve} use
 * {@link SingleStrokeOptions} instead.
 *
 * <p>See <a href=https://apexcharts.com/docs/options/stroke/>
 * https://apexcharts.com/docs/options/stroke/</a> for parameter details.
 *
 * @version 0.1
 * @since 14.01.20
 */
public class MultiStrokeOptions extends StrokeOptions {

  private final List<LineCurve> curve;

  /**
   * @param show show or hide path-stroke / line
   * @param curve In line / area charts, whether to draw smooth lines or straight lines
   * @param lineCap set the starting and ending points of stroke
   * @param width set the width of border for svg path
   * @param dashArray Creates dashes in borders of svg path. Higher number creates more space
   *     between dashes in the border. Can be a single element array (applies for all strokes) or an
   *     array with elements equals the number of strokes in the chart
   */
  public MultiStrokeOptions(
      boolean show, List<LineCurve> curve, LineCap lineCap, double width, int[] dashArray) {
    super(show, lineCap, width, dashArray);
    this.curve = curve;
  }

  public List<LineCurve> getCurve() {
    return curve;
  }
}
