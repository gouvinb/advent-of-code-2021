package advent.of.code.day02

fun List<SubmarineCommand>.multipliesHorizontalByDepth() =
	filterIsInstance<Forward>()
		.sumOf { it.value }
		.times(
			filter { it !is Forward }.sumOf {
				when (it) {
					is Down -> it.depth
					/* is Up */ else -> -it.value
				}
			}
		)

fun List<SubmarineCommand>.multipliesHorizontalByDepthWithAim(): Int {
	var (aim, horizontalPosition, depth) = Triple(0, 0, 0)
	forEach {
		when (it) {
			is Down -> aim += it.depth
			is Up -> aim -= it.depth
			is Forward -> {
				horizontalPosition += it.horizontalPosition
				depth += aim * it.horizontalPosition
			}
		}
	}

	return horizontalPosition * depth
}
