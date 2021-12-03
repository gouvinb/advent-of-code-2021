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
