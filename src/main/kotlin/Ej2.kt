import java.util.Scanner



/**
 *@author: Teo
 *@date: 9/1/24
 *@param n de tipo enter
 *@return: Enter
 */

fun euclides(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        euclides(b, a % b)
    }
}

fun main() {
    val scan= Scanner(System.`in`)
    print("Introdueix un número: ")
    val num1 = scan.nextInt()
    print("Introdueix un altre número: ")
    val num2 = scan.nextInt()
    val mcd = euclides(num1, num2)
    println("El màxim comú divisor de $num1 i $num2 és: $mcd")
}
