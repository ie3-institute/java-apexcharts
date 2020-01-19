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
public class DataLabels {

  private final boolean show;
  private final NameOptions name;
  private final ValueOptions value;
  private final TotalOptions total;

  public DataLabels(boolean show, NameOptions name, ValueOptions value, TotalOptions total) {
    this.show = show;
    this.name = name;
    this.value = value;
    this.total = total;
  }

  public boolean isShow() {
    return show;
  }

  public NameOptions getName() {
    return name;
  }

  public ValueOptions getValue() {
    return value;
  }

  public TotalOptions getTotal() {
    return total;
  }
}
