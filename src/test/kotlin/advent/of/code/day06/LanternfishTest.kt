package advent.of.code.day06

import advent.of.code.readResourceOrEmpty
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LanternfishTest {
	private val sampleCase = Lanternfish(readResourceOrEmpty("/day06/input-sample.txt"))
	private val case = Lanternfish(readResourceOrEmpty("/day06/input.txt"))

	@Test
	fun calculateLanternfishAfterDay() {
		assertEquals(5934, sampleCase.calculateLanternfishAfterDay(80))
		assertEquals(26984457539, sampleCase.calculateLanternfishAfterDay(256))
		assertEquals(371379, case.calculateLanternfishAfterDay(80))
		assertEquals(1674303997472, case.calculateLanternfishAfterDay(256))
	}
}
