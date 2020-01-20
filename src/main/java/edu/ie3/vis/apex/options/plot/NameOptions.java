/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.plot;

import java.awt.*;

import static edu.ie3.vis.apex.util.ApexUtil.rgbToHex;


/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 19.01.20
 */
public class NameOptions {

    private final boolean show;
    private final String  fontSize;
    private final String  fontFamily;
    private final String  color;
    private final int     offsetY;

    public NameOptions(boolean show, int fontSize, String fontFamily, Color color, int offsetY) {
        this.show = show;
        this.fontSize = Integer.toString(fontSize).concat("px");
        this.fontFamily = fontFamily;
        this.color = rgbToHex(color);
        this.offsetY = offsetY;
    }

    public boolean isShow() {
        return show;
    }

    public String getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public String getColor() {
        return color;
    }

    public int getOffsetY() {
        return offsetY;
    }
}
