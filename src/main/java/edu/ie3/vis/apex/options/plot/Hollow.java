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
public class Hollow {

  private final int margin;
  private final String size;
  private final String background;
  private final String image;
  private final int imageWidth;
  private final int imageHeight;
  private final int imageOffsetX;
  private final int imageOffsetY;
  private final boolean imageClipped;
  private final Position position;
  private final DropShadow dropShadow;

  public Hollow(
      int margin,
      int size,
      String background,
      String image,
      int imageWidth,
      int imageHeight,
      int imageOffsetX,
      int imageOffsetY,
      boolean imageClipped,
      Position position,
      DropShadow dropShadow) {
    this.margin = margin;
    this.size = Integer.toString(size).concat("%");
    this.background = background;
    this.image = image;
    this.imageWidth = imageWidth;
    this.imageHeight = imageHeight;
    this.imageOffsetX = imageOffsetX;
    this.imageOffsetY = imageOffsetY;
    this.imageClipped = imageClipped;
    this.position = position;
    this.dropShadow = dropShadow;
  }

  public int getMargin() {
    return margin;
  }

  public String getSize() {
    return size;
  }

  public String getBackground() {
    return background;
  }

  public int getImageWidth() {
    return imageWidth;
  }

  public int getImageHeight() {
    return imageHeight;
  }

  public int getImageOffsetX() {
    return imageOffsetX;
  }

  public int getImageOffsetY() {
    return imageOffsetY;
  }

  public boolean isImageClipped() {
    return imageClipped;
  }

  public Position getPosition() {
    return position;
  }

  public DropShadow getDropShadow() {
    return dropShadow;
  }

  public String getImage() {
    return image;
  }
}
