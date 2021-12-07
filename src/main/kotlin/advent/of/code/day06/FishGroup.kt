package advent.of.code.day06

data class FishGroup(
	var zero: Long = EMPTY_VALUE,
	var one: Long = EMPTY_VALUE,
	var two: Long = EMPTY_VALUE,
	var three: Long = EMPTY_VALUE,
	var four: Long = EMPTY_VALUE,
	var five: Long = EMPTY_VALUE,
	var six: Long = EMPTY_VALUE,
	var seven: Long = EMPTY_VALUE,
	var eight: Long = EMPTY_VALUE,
) {

	fun rotate() {
		val buffer = zero
		zero = one
		one = two
		two = three
		three = four
		four = five
		five = six
		six = seven + buffer
		seven = eight
		eight = buffer
	}

	fun count() = zero + one + two + three + four + five + six + seven + eight

	companion object {
		const val EMPTY_VALUE = 0L

		const val CYCLE_0 = 0L
		const val CYCLE_1 = 1L
		const val CYCLE_2 = 2L
		const val CYCLE_3 = 3L
		const val CYCLE_4 = 4L
		const val CYCLE_5 = 5L
		const val CYCLE_6 = 6L
		const val CYCLE_7 = 7L
		const val CYCLE_8 = 8L
	}
}
