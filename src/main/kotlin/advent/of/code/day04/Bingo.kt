package advent.of.code.day04

class Bingo(val drawList: List<Int>, val boards: List<Board>) {
	fun getResults() = sequence {
		drawList.forEach reveal@{ number ->
			boards.filter { it.isNotWin() }.forEach { board ->
				board.reveal(number)

				if (board.isWin()) {
					yield(board.sumOfUnmarked * number)
				}
				if (boards.all { it.isWin() }) return@reveal
			}
		}
	}
}
