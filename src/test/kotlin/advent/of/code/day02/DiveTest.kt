package advent.of.code.day02

import advent.of.code.readResourceOrEmpty
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class DiveTest {
	@Test
	fun calculateHorizontalPositionAndDepth() {
		assertEquals(150, Dive(readResourceOrEmpty("/day02/input-sample.txt")).calculateHorizontalPositionAndDepth())
		assertEquals(1383564, Dive(readResourceOrEmpty("/day02/input.txt")).calculateHorizontalPositionAndDepth())
	}
}
