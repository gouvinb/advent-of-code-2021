package advent.of.code.day03

class BinaryDiagnostic(input: String) {
	private val diagnostic = input.lines()
		.map { line -> line.toCharArray().map { it.toString().toInt() }.toList() }
		.filter { it.isNotEmpty() }

	fun calculatePowerConsumption() = diagnostic.let { bits ->
		bits.calculateBitOccurrences().mostCommonBits().toInt(2) *
			bits.calculateBitOccurrences().leastCommonBits().toInt(2)
	}

	fun calculateRating(): Int =
		diagnostic.findRating { bit, count -> bit == 1 && count >= 0 || bit == 0 && count < 0 } *
			diagnostic.findRating { bit, count -> bit == 1 && count < 0 || bit == 0 && count >= 0 }

	private fun List<List<Int>>.findRating(position: Int = 0, compare: (bit: Int, bitOccurrence: Int) -> Boolean): Int =
		filter { number -> compare(number[position], calculateBitOccurrencesForPosition(position)) }
			.let {
				when (it.size) {
					1 -> it.first().joinToString("").toInt(2)
					else -> it.findRating(position + 1, compare)
				}
			}

	private fun List<List<Int>>.calculateBitOccurrences(): List<Int> = first().indices.map { position ->
		calculateBitOccurrencesForPosition(position)
	}

	private fun List<List<Int>>.calculateBitOccurrencesForPosition(position: Int) =
		fold(0) { acc, number ->
			if (number[position] == 1) acc + 1
			else acc - 1
		}

	private fun List<Int>.mostCommonBits() = map { bit -> if (bit > 0) 1 else 0 }.joinToString("")
	private fun List<Int>.leastCommonBits() = map { bit -> if (bit > 0) 0 else 1 }.joinToString("")
}
