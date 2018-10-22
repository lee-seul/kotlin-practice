package sum

fun sum(a: IntArray): Int {
    var result = 0
    for (number in a) {
        result += number
    }
    return result
}
