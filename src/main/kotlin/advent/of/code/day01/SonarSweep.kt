package advent.of.code.day01

class SonarSweep(input: String) {
	private val measureList = input.lines().mapNotNull { it.toIntOrNull() }

	fun getIncreasedDepthCount(): Int {
		var lastMeasure = measureList.firstOrNull()
		return measureList.drop(1).count { measure ->
			(lastMeasure!! < measure).also { lastMeasure = measure }
		}
	}
}