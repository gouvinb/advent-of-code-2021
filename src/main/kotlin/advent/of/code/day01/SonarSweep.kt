package advent.of.code.day01

class SonarSweep(input: String) {
	private val measureList = input.lines().mapNotNull { it.toIntOrNull() }

	fun getIncreasedDepthCount(): Int {
		var lastMeasure = measureList.firstOrNull()
		return measureList.drop(1).count { measure ->
			(lastMeasure!! < measure).also { lastMeasure = measure }
		}
	}

	fun getMeasurementLargerThanThePreviousCount(): Int {
		var lastMeasure = measureList.take(3)
		return measureList.windowed(3).count { measureGroup ->
			(lastMeasure.sum() < measureGroup.sum()).also { lastMeasure = measureGroup }
		}
	}
}
