package advent.of.code.day01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SonarSweepTest {
	@Test
	fun getIncreasedDepthCount() {
		assertEquals(0, SonarSweep("1\n1\n1\n1\n1").getIncreasedDepthCount())
		assertEquals(1, SonarSweep("1\n1\n1\n1\n2").getIncreasedDepthCount())
		assertEquals(2, SonarSweep("1\n1\n2\n1\n2").getIncreasedDepthCount())
		assertEquals(2, SonarSweep("1\n2\n2\n1\n2").getIncreasedDepthCount())

		assertEquals(7, SonarSweep(javaClass.getResource("/day01/input-sample.txt")?.readText() ?: "").getIncreasedDepthCount())

		assertEquals(1448, SonarSweep(javaClass.getResource("/day01/input.txt")?.readText() ?: "").getIncreasedDepthCount())
	}
}