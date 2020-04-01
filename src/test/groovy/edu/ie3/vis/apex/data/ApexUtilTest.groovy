/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */
package edu.ie3.vis.apex.data


import edu.ie3.vis.apex.util.ApexUtil
import spock.lang.Specification

import java.awt.Color

class ApexUtilTest extends Specification {

	def "test throws IllegalStateException"() {
		given: "ApexUtil"

		when: def testUtil = new ApexUtil()
		testUtil.rgbToHex(Color.red)

		then: IllegalStateException ise = thrown()
		ise.message == "This is an utility class!"
	}
}
