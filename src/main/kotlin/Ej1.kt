/**
*fun m1(n:Int): Int {
 *   val result:Int
 *  if (n == 0) result=1
 *  else result = n * m1 (n-1)
 * return (result)
*}

 *@author: Teo
 *@date: 9/1/24
 *@param n de tipo enter
 *@return: enter
*/

fun main() {

}

fun m1(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

/**
 * fun m2(x:Double, n:Int): Int {
 * val result:Int
 * if (n == 0) result =0
 * else result = n + m2 (x, n-1)
 * return (result)
 * }
 *
 *@author: Teo
 *@date: 9/1/24
 *@param x de tipo enter
 *@param n de tipo enter
 *@return: Enter
 */
fun m2(x: Double, n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result += i
    }
    return result
}

/**
 * fun m3(n:Int) : Int {
 * val result:Int
 * if (n < 2 ) result = 0
 * else result = 1 + m3 (n/2)
 * return (result)
 * }
 *@author: Teo
 *@date: 9/1/24
 *@param n de tipo enter
 *@return: Enter
 */

fun m3(n: Int): Int {
    var result = 0
    var num = n
    while (num >= 2) {
        result++
        num /= 2
    }
    return result
}


/**
 * fun m4(n:Int) : Int {
 * val result:Int
 * if (n == 0) result = 0
 * else result = m4 (n / 10) + n % 10
 * return (result)
 * }
 *@author: Teo
 *@date: 9/1/24
 *@param n de tipo enter
 *@return: Enter
 */
fun m4(n: Int): Int {
    var result = 0
    var num = n
    while (num > 0) {
        result += num % 10
        num /= 10
    }
    return result
}
