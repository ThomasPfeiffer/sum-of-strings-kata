fun getLucky(s: String, k: Int): Int = transform(convert(s), k)

fun convert(s: String): Int =
    s.toCharArray()
        .map { it.code - 96 }
        .fold("") {  current, next -> "$current$next" }
        .toInt()

fun transform(number: Int, k: Int): Int = if (k == 0) number else
    transform(number.toString().toCharArray().sumOf { it.digitToInt() }, k - 1)

