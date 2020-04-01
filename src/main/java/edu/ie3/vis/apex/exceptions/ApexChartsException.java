/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
*/
package edu.ie3.vis.apex.exceptions;

/**
 * General exception that should be used whenever an exception is thrown inside {@link
 * edu.ie3.vis.apex} and its child packages when invalid stuff happens during chart generation.
 *
 * @version 0.1
 * @since 17.01.20
 */
public class ApexChartsException extends Exception {

  public ApexChartsException() {
    super();
  }

  public ApexChartsException(String message) {
    super(message);
  }
}
