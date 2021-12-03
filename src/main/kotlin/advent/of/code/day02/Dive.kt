package advent.of.code.day02

class Dive(input: String) {
	private val submarineCommandList = mutableListOf<SubmarineCommand>()

	init {
		submarineCommandList.addAll(input.lines().mapNotNull { line ->
			"""(forward|down|up) (\d+)""".toRegex().matchEntire(line)
				?.groupValues
				?.drop(1)
				?.takeIf { it.size == 2 && it[1].toIntOrNull() != null }
				?.let { SubmarineCommand.parse(it[0], it[1].toInt()) }
		})
	}

	fun calculateHorizontalPositionAndDepth() = submarineCommandList.multipliesHorizontalByDepth()
}
