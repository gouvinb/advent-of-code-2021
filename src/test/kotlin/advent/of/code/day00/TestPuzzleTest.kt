package advent.of.code.day00

import advent.of.code.readResourceOrEmpty
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TestPuzzleTest {

	@Test
	fun sum() {
		assertEquals(3, TestPuzzle(
			readResourceOrEmpty("/day00/input-a.txt"),
			readResourceOrEmpty("/day00/input-b.txt"),
		).sum())
		assertEquals(0, TestPuzzle("", "").sum())
		assertEquals(2, TestPuzzle("2", "").sum())
		assertEquals(Int.MIN_VALUE, TestPuzzle(Int.MAX_VALUE.toString(), "1").sum())
	}
}
