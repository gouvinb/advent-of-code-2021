package advent.of.code.day04

sealed class Square {
	class Marked(val number: Int) : Square()
	class Unmarked(val number: Int) : Square()

	fun revealWith(value: Int) = when {
		this is Unmarked && number == value -> Marked(number)
		else -> this
	}
}
