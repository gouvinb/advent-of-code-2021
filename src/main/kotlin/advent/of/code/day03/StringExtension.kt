package advent.of.code.day03

fun List<String>.to2dArrayOfInt(radix: Int = 10) =
	map { line -> line.toCharArray().map { it.toString().toInt(radix) }.toList() }
