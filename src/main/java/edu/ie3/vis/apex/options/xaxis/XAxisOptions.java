/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.xaxis;

import java.util.ArrayList;
import java.util.List;


/**
 * Options that can be used for the customization of the x-axis of an axis chart
 *
 * @version 0.1
 * @since 14.01.20
 */
public class XAxisOptions {

    public static final XAxisOptions DEFAULT = new XAxisOptions(XAxisType.category, new ArrayList<>());

    private final XAxisType    type;
    private final List<String> categories;

    /**
     * Standard constructor for x-axis options
     *
     * @param type       the type of the axis
     * @param categories the categories that should be shown on the axis
     */
    public XAxisOptions(XAxisType type, List<String> categories) {
        this.type = type;
        this.categories = categories;
    }

    public XAxisOptions(XAxisType type) {
        this.type = type;
        this.categories = new ArrayList<>();
    }

    public XAxisType getType() {
        return type;
    }

    public List<String> getCategories() {
        return categories;
    }
}
