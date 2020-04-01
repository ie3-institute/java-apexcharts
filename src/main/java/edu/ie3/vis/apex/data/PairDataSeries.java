/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.data;

import java.util.List;

/**
 * Representation of a data series with paired {@link Tuple2} elements
 *
 * @param <X> type of x element, can be e.g. date strings or numerical values
 * @param <Y> type of y element, normally numeric values
 */
public class PairDataSeries<X extends Comparable<X>, Y extends Comparable<Y>> {

  private final String name;
  private final List<Tuple2<X, Y>> data;

  public PairDataSeries(String name, List<Tuple2<X, Y>> data) {
    this.name = name;
    this.data = data;
  }

  public String getName() {
    return name;
  }

  public List<Tuple2<X, Y>> getData() {
    return data;
  }
}
