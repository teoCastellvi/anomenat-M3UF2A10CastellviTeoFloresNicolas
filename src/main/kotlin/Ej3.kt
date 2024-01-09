/**
 *@author: Nico
 *@date: 9/1/24
 *@param x de tipo enter
 *@param y de tipo enter
 *@return: Enter
 */
fun multiplicacioRecursiva(x: Int, y: Int): Int {
    var result: Int
    if (y == 0) {
        result = 0
    } else if (y and 1 == 0) {
        result = multiplicacioRecursiva(x shl 1, y shr 1)
    } else {
        result = multiplicacioRecursiva(x shl 1, y shr 1) + x
    }
    return result
}
