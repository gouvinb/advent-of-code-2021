package advent.of.code.day04

import advent.of.code.day04.Board.Companion.SIZE

class GiantSquid(input: String) {
	private val drawList = ArrayDeque(input.lines().first().split(",").map { it.toInt() })
	private val boardListRaw = input.lines().drop(2).joinToString("\n").split("\n\n").map { board ->
		board.trim().split("""\s+""".toRegex()).map { square -> square.toInt() }.chunked(SIZE)
	}
	private val bingo = Bingo(drawList, mutableListOf<Board>().also { boards ->
		boardListRaw.forEach { boardsRaw ->
			boards.add(Board(boardsRaw.map { row -> row.map { value -> Square.Unmarked(value) } }))
		}
	})

	fun getFinalScoreOfFirstWinnerBoard() = bingo.getResults().first()

	fun getFinalScoreOfLastWinnerBoard() = bingo.getResults().last()
}
