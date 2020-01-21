/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.options.chart;

import edu.ie3.vis.apex.options.zoom.ZoomOptions;


/**
 * Wrapper class holding all options that can be used to parameterize charts.
 *
 * @version 0.1
 * @since 13.01.20
 */
public class ChartOptions {

    private final ChartType   type;
    private final Boolean     stacked;
    private final String      height;
    private final ZoomOptions zoom;
    private final Animations  animations;
    private final DynamicAnimation dynamicAnimation;

    /**
     * Default constructor for chart parameterization
     *
     * @param type             the type of the chart, see {@link ChartType} for details
     * @param stacked          enables stacked option for axis charts.  Note: A stacked chart works only for same
     *                         chart types and won’t work in combo/mixed charts combinations.
     *                         So, an area series combined with a column series will not work.
     * @param height           height of the chart in pixel
     * @param zoomOptions      zoomOptions configuration in axis charts, see {@link ZoomOptions} for details
     * @param animations       animation configuration, see {@link Animations} for details
     * @param dynamicAnimation dynamic animation configuration, see {@link DynamicAnimation} for details
     */
    public ChartOptions(ChartType type,
                        Boolean stacked,
                        int height,
                        ZoomOptions zoomOptions,
                        Animations animations,
                        DynamicAnimation dynamicAnimation) {
        this.type = type;
        this.stacked = stacked;
        this.height = Integer.toString(height).concat("px");
        this.zoom = zoomOptions;
        this.animations = animations;
        this.dynamicAnimation = dynamicAnimation;
    }

    /**
     * Constructor for chart parameterization with disabled {@link DynamicAnimation}s
     *
     * @param type        the type of the chart, see {@link ChartType} for details
     * @param stacked     enables stacked option for axis charts.  Note: A stacked chart works only for same
     *                    chart types and won’t work in combo/mixed charts combinations.
     *                    So, an area series combined with a column series will not work.
     * @param height      height of the chart in pixel
     * @param zoomOptions zoomOptions configuration in axis charts, see {@link ZoomOptions} for details
     * @param animations  animation configuration, see {@link Animations} for details
     */
    public ChartOptions(ChartType type, Boolean stacked, int height, ZoomOptions zoomOptions, Animations animations) {
        this(type, stacked, height, zoomOptions, animations, new DynamicAnimation(false, 0L));
    }

    public ChartType getType() {
        return type;
    }

    public Boolean getStacked() {
        return stacked;
    }

    public String getHeight() {
        return height;
    }

    public ZoomOptions getZoom() {
        return zoom;
    }

    public Animations getAnimations() {
        return animations;
    }

    public DynamicAnimation getDynamicAnimation() {
        return dynamicAnimation;
    }
}
