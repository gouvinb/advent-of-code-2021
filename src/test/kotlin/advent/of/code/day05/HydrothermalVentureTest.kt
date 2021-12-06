package advent.of.code.day05

import advent.of.code.readResourceOrEmpty
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class HydrothermalVentureTest {
	private val sampleCase = HydrothermalVenture(readResourceOrEmpty("/day05/input-sample.txt"))
	private val case = HydrothermalVenture(readResourceOrEmpty("/day05/input.txt"))

	@Test
	fun getIntersectionsNumber() {
		assertEquals(5, sampleCase.getIntersectionsNumber())
		assertEquals(6189, case.getIntersectionsNumber())
	}
}
