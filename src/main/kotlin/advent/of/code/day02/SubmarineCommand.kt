package advent.of.code.day02

sealed class SubmarineCommand(val value: Int) {
	companion object {
		fun parse(typeStr: String, value: Int) = when (typeStr) {
			"forward" -> Forward(value)
			"down" -> Down(value)
			"up" -> Up(value)
			else -> null
		}
	}
}

data class Down(val depth: Int) : SubmarineCommand(depth)
data class Forward(val horizontalPosition: Int) : SubmarineCommand(horizontalPosition)
data class Up(val depth: Int) : SubmarineCommand(depth)
