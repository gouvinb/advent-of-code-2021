package advent.of.code.day03

import advent.of.code.readResourceOrEmpty
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class BinaryDiagnosticTest {

	private val sampleCase = BinaryDiagnostic(readResourceOrEmpty("/day03/input-sample.txt"))
	private val case = BinaryDiagnostic(readResourceOrEmpty("/day03/input.txt"))

	@Test
	fun calculatePowerConsumption() {
		assertEquals(198, sampleCase.calculatePowerConsumption())
		assertEquals(4174964, case.calculatePowerConsumption())
	}

	@Test
	fun calculateRating() {
		assertEquals(230, sampleCase.calculateRating())
		assertEquals(4474944, case.calculateRating())
	}
}
