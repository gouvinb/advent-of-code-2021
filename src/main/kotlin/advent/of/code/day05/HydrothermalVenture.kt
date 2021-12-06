package advent.of.code.day05

class HydrothermalVenture(input: String) {
	private val lines = input.lines().map { line ->
		line.split(" -> ")
			.let {
				val (start, end) = it.map { coordinateString ->
					val (x, y) = coordinateString.split(",").map { it.toInt() }
					Position(x, y)
				}
				Line(start, end)
			}
	}

	fun getHorizontalAndVerticalIntersectionsNumber() = lines
		.filter { it.isHorizontal() || it.isVertical() }
		.flatMap { it.getPointSequence() }
		.groupingBy { it }
		.eachCount()
		.values
		.count { it >= 2 }

	fun getDiagonalIntersectionsNumber() = lines
		.filter { it.isDiagonal() }
		.flatMap { it.getPointSequence() }
		.groupingBy { it }
		.eachCount()
		.values
		.count { it >= 2 }
}
