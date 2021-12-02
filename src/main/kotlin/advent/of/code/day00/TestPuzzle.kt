package advent.of.code.day00

class TestPuzzle(private val strFromRes1: String, private val strFromRes2: String) {
	fun sum(): Int {
		fun toIntOrElse(x: String, default: Int = 0) = try {
			x.toInt()
		} catch (_: NumberFormatException) {
			default
		}

		return toIntOrElse(strFromRes1) + toIntOrElse(strFromRes2)
	}
}