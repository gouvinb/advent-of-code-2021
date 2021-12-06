package advent.of.code.day04

class Board(var rows: List<List<Square>>) {
	fun reveal(number: Int) {
		rows = rows.map { row ->
			row.map { square -> square.revealWith(number) }
		}
	}

	fun isWin() = WINNING_RULES.any { configuration ->
		configuration.all { (row, column) -> rows[row][column] is Square.Marked }
	}

	fun isNotWin() = !isWin()

	val sumOfUnmarked: Int
		get() = rows.fold(0) { rowAcc, row ->
			rowAcc + row.fold(0) { squareAcc, square ->
				squareAcc + when (square) {
					is Square.Unmarked -> square.number
					else -> 0
				}
			}
		}

	companion object {
		const val SIZE = 5

		private val RANGE = 0 until SIZE

		private val ROWS = RANGE.map { row -> RANGE.map { square -> Pair(row, square) } }
		private val COLUMNS = RANGE.map { column -> RANGE.map { square -> Pair(square, column) } }

		private val WINNING_RULES = ROWS + COLUMNS
	}
}
