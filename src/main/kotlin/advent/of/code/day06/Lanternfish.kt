package advent.of.code.day06

import advent.of.code.day06.FishGroup.Companion.CYCLE_0
import advent.of.code.day06.FishGroup.Companion.CYCLE_1
import advent.of.code.day06.FishGroup.Companion.CYCLE_2
import advent.of.code.day06.FishGroup.Companion.CYCLE_3
import advent.of.code.day06.FishGroup.Companion.CYCLE_4
import advent.of.code.day06.FishGroup.Companion.CYCLE_5
import advent.of.code.day06.FishGroup.Companion.CYCLE_6
import advent.of.code.day06.FishGroup.Companion.CYCLE_7
import advent.of.code.day06.FishGroup.Companion.CYCLE_8
import advent.of.code.day06.FishGroup.Companion.EMPTY_VALUE

class Lanternfish(val input: String) {
	private val initialState: FishGroup
		get() = input
			.split(',')
			.map { it.toLong() }
			.groupBy { it }
			.let {
				FishGroup(
					it[CYCLE_0]?.size?.toLong() ?: EMPTY_VALUE,
					it[CYCLE_1]?.size?.toLong() ?: EMPTY_VALUE,
					it[CYCLE_2]?.size?.toLong() ?: EMPTY_VALUE,
					it[CYCLE_3]?.size?.toLong() ?: EMPTY_VALUE,
					it[CYCLE_4]?.size?.toLong() ?: EMPTY_VALUE,
					it[CYCLE_5]?.size?.toLong() ?: EMPTY_VALUE,
					it[CYCLE_6]?.size?.toLong() ?: EMPTY_VALUE,
					it[CYCLE_7]?.size?.toLong() ?: EMPTY_VALUE,
					it[CYCLE_8]?.size?.toLong() ?: EMPTY_VALUE,
				)
			}

	fun calculateLanternfishAfterDay(days: Int): Long {
		val family = initialState
		repeat(days) { family.rotate() }
		return family.count()
	}
}
