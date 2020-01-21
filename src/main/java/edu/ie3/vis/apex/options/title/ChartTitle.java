/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.title;

/**
 * Text to display as a title of chart
 *
 * @version 0.1
 * @since 13.01.20
 */
public class ChartTitle {

  private final String text;
  private final TextAlignment align;
  private final long margin;
  private final long offsetX;
  private final long offsetY;
  private final boolean floating;

  /**
   * Standard constructor for chart title
   * @param text the title text
   * @param align the text alignment
   * @param margin vertical spacing around the title text
   * @param offsetX left offset for title text
   * @param offsetY top offset for title text
   * @param floating if set to true, it will take out the title text from the chart area
   *                 and make it float on top of the chart.
   */
  public ChartTitle(
      String text, TextAlignment align, long margin, long offsetX, long offsetY, boolean floating) {
    this.text = text;
    this.align = align;
    this.margin = margin;
    this.offsetX = offsetX;
    this.offsetY = offsetY;
    this.floating = floating;
  }

  public ChartTitle(String text) {
    this.text = text;
    this.align = TextAlignment.left;
    this.margin = 10;
    this.offsetX = 0;
    this.offsetY = 0;
    this.floating = false;
  }

  public String getText() {
    return text;
  }

  public TextAlignment getAlign() {
    return align;
  }

  public long getMargin() {
    return margin;
  }

  public long getOffsetX() {
    return offsetX;
  }

  public long getOffsetY() {
    return offsetY;
  }

  public boolean isFloating() {
    return floating;
  }
}
