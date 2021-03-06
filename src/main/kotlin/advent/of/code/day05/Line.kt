package advent.of.code.day05

import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.sign

data class Line(val start: Position, val end: Position) {
	fun isHorizontal() = start.x == end.x
	fun isVertical() = start.y == end.y

	fun isDiagonal() = (end.x - start.x).absoluteValue == (end.y - start.y).absoluteValue

	fun getPointSequence() = mutableListOf<Position>().apply {
		val xOffset = end.x - start.x
		val yOffset = end.y - start.y

		(0..max(xOffset.absoluteValue, yOffset.absoluteValue)).forEach { s ->
			add(Position(start.x + s * xOffset.sign, start.y + s * yOffset.sign))
		}
	}
}
