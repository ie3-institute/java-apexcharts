/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex.data;

import java.util.Objects;


/**
 * Simple representation of a (x,y) Tuple with two elements
 *
 * @param <X> type of x element, can be e.g. date strings or numerical values
 * @param <Y> type of y element, normally numeric values
 */
public class Tuple2<X extends Comparable<X>, Y extends Comparable<Y>> implements Comparable<Tuple2<X, Y>> {

    private final X x;
    private final Y y;

    /**
     * Create a (x,y) tuple
     * @param x
     * @param y
     */
    public Tuple2(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    @Override
    public int compareTo(Tuple2<X, Y> other) {
        return this.x.compareTo(other.x);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Tuple2<?, ?> tuple2 = (Tuple2<?, ?>) o;
        return x.equals(tuple2.x) && y.equals(tuple2.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
