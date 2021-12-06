package advent.of.code.day04

import advent.of.code.readResourceOrEmpty
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class GiantSquidTest {
	private val sampleCase = GiantSquid(readResourceOrEmpty("/day04/input-sample.txt"))
	private val case = GiantSquid(readResourceOrEmpty("/day04/input.txt"))

	@Test
	fun getFinalScoreOfFirstWinnerBoard() {
		assertEquals(4512, sampleCase.getFinalScoreOfFirstWinnerBoard())
		assertEquals(10374, case.getFinalScoreOfFirstWinnerBoard())
	}

	@Test
	fun getFinalScoreOfLastWinnerBoard() {
		assertEquals(1924, sampleCase.getFinalScoreOfLastWinnerBoard())
		assertEquals(24742, case.getFinalScoreOfLastWinnerBoard())
	}
}
