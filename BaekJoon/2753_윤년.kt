import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    if (n%4 == 0 && n%100 != 0 || n%400 == 0) {
        print(1)
    }
    else print(0)
}
