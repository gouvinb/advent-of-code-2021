package advent.of.code.day02

import advent.of.code.readResourceOrEmpty
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class DiveTest {
	private val sampleCase = Dive(readResourceOrEmpty("/day02/input-sample.txt"))
	private val case = Dive(readResourceOrEmpty("/day02/input.txt"))

	@Test
	fun calculateHorizontalPositionAndDepth() {
		assertEquals(150, sampleCase.calculateHorizontalPositionAndDepth())
		assertEquals(1383564, case.calculateHorizontalPositionAndDepth())
	}

	@Test
	fun calculateHorizontalPositionAndDepthWithAim() {
		assertEquals(900, sampleCase.calculateHorizontalPositionAndDepthWithAim())
		assertEquals(1488311643, case.calculateHorizontalPositionAndDepthWithAim())
	}
}
