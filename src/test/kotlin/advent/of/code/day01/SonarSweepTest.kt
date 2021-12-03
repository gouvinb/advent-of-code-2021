package advent.of.code.day01

import advent.of.code.readResourceOrEmpty
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SonarSweepTest {
	private val internalCase1 = SonarSweep("1\n1\n1\n1\n1")
	private val internalCase2 = SonarSweep("1\n1\n1\n1\n2")
	private val internalCase3 = SonarSweep("1\n1\n2\n1\n2")
	private val internalCase4 = SonarSweep("1\n2\n2\n1\n2")
	private val internalCase5 = SonarSweep("1\n2\n3\n4\n5")

	private val sampleCase = SonarSweep(readResourceOrEmpty("/day01/input-sample.txt"))
	private val sampleCase2 = SonarSweep(readResourceOrEmpty("/day01/input-sample-2.txt"))
	private val case = SonarSweep(readResourceOrEmpty("/day01/input.txt"))

	@Test
	fun getIncreasedDepthCount() {
		assertEquals(0, internalCase1.getIncreasedDepthCount())
		assertEquals(1, internalCase2.getIncreasedDepthCount())
		assertEquals(2, internalCase3.getIncreasedDepthCount())
		assertEquals(2, internalCase4.getIncreasedDepthCount())

		assertEquals(7, sampleCase.getIncreasedDepthCount())
		assertEquals(1448, case.getIncreasedDepthCount())
	}

	@Test
	fun getMeasurementLargerThanThePreviousCount() {
		assertEquals(0, internalCase1.getMeasurementLargerThanThePreviousCount())
		assertEquals(1, internalCase2.getMeasurementLargerThanThePreviousCount())
		assertEquals(1, internalCase3.getMeasurementLargerThanThePreviousCount())
		assertEquals(0, internalCase4.getMeasurementLargerThanThePreviousCount())
		assertEquals(2, internalCase5.getMeasurementLargerThanThePreviousCount())

		assertEquals(5, sampleCase2.getMeasurementLargerThanThePreviousCount())
		assertEquals(1471, case.getMeasurementLargerThanThePreviousCount())
	}

}
