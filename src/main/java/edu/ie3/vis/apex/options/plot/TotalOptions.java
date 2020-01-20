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
public class TotalOptions {

    private final boolean show;
    private final String  label;
    private final String  color;
    private final String  formatter;

    public TotalOptions(boolean show, String label, Color color, String formatter) {
        this.show = show;
        this.label = label;
        this.color = rgbToHex(color);
        this.formatter = formatter;
    }

    public boolean isShow() {
        return show;
    }

    public String getLabel() {
        return label;
    }

    public String getColor() {
        return color;
    }

    public String getFormatter() {
        return formatter;
    }
}
