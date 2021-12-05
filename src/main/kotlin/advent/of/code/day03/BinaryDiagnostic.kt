package advent.of.code.day03

class BinaryDiagnostic(input: String) {
	private val diagnostic = input.lines()
		.to2dArrayOfInt()
		.filter { it.isNotEmpty() }

	fun calculatePowerConsumption() = diagnostic.let { bits ->
		bits.calculateBitOccurrences().mostCommonBits() * bits.calculateBitOccurrences().leastCommonBits()
	}

	fun calculateRating(): Int = diagnostic.findRating { bit, occ -> bit == 1 && occ >= 0 || bit == 0 && occ < 0 } *
		diagnostic.findRating { bit, occ -> bit == 1 && occ < 0 || bit == 0 && occ >= 0 }
}
