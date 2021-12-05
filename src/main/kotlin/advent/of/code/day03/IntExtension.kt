package advent.of.code.day03

fun List<Int>.mostCommonBits() = map { bit -> if (bit > 0) 1 else 0 }.joinToString("").toInt(2)
fun List<Int>.leastCommonBits() = map { bit -> if (bit > 0) 0 else 1 }.joinToString("").toInt(2)

fun List<List<Int>>.calculateBitOccurrences(): List<Int> = first().indices.map { position ->
	calculateBitOccurrencesForPosition(position)
}

fun List<List<Int>>.calculateBitOccurrencesForPosition(position: Int) = fold(0) { acc, number ->
	when {
		number[position] == 1 -> acc + 1
		else -> acc - 1
	}
}

fun List<List<Int>>.findRating(position: Int = 0, predicate: (bit: Int, occ: Int) -> Boolean): Int = filter { number ->
	predicate(number[position], calculateBitOccurrencesForPosition(position))
}.let {
	when (it.size) {
		1 -> it.first().joinToString("").toInt(2)
		else -> it.findRating(position + 1, predicate)
	}
}
