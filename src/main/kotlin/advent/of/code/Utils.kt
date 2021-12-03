package advent.of.code

fun Any.readResource(path: String) = javaClass.getResource(path)?.readText()

fun Any.readResourceOrEmpty(path: String) = readResource(path) ?: ""
