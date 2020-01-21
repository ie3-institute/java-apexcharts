/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.util;

import java.awt.*;


/**
 * Utility class that provides functions that are used in several places in this package
 *
 * @version 0.1
 * @since 19.01.20
 */
public class ApexUtil {

    private ApexUtil() {
        throw new IllegalStateException("This is an utility class!");
    }

    /**
     * Converts a given {@link java.awt.Color} into it's hex representation string
     *
     * @param color the color that should be converted
     * @return the hex representation of the provided color as String
     */
    public static String rgbToHex(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }
}
