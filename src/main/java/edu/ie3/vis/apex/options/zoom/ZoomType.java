package edu.ie3.vis.apex.options.zoom;

/**
 * The zoom type that allows zooming in axis charts. Can be used with {@link ZoomOptions}
 *
 * @version 0.1
 * @since 21.01.20
 */
public enum ZoomType {

    x("x"), y("y"), xy("xy");

    private String id;

    ZoomType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id;
    }

}
