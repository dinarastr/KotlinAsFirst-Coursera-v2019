package lesson3.task1

fun count(n: Int): Int {
    var x = n
    var c = 0
    while (n > 0) {
        c += 1
        x /= 10
    }
    return c
}
