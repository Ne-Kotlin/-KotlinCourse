fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean = if (
        ((a <= r && b <= s) || (b <= r && a <= s) || (b <= r && c <= s) || 
        (c <= r && b <= s) || (c <= r && a <= s) || (a <= r && c <= s))
    ) true
    else false

const val HIGHT_A = 3
const val WIDTH_B = 5
const val LENGHT_C = 4

const val HIGHT_PORT_A = 4
const val WIDTH_PORT_B = 5

fun main() {
    if(HIGHT_A > 0 && WIDTH_B > 0 && LENGHT_C > 0 && HIGHT_PORT_A > 0 && WIDTH_PORT_B > 0){
        var test = brickPasses(HIGHT_A, WIDTH_B, LENGHT_C, HIGHT_PORT_A, WIDTH_PORT_B)
        if (test == true) {
            println("Кирпич пройдёт")
        }else{
            println("Кирпич не пройдёт")
        }
    }else print("Ошибка")
}
 
import kotlin.math.*
//Количество цифр в числе
fun digitCountInNumber(n: Int, m: Int): Int {
    var numb = abs(n)
    var counter:Int = 0
    while (numb > 0){
        if(numb % 10 == m){
            counter++
        }
        numb/=10
    }
    return counter
}
const val N = -763946666 
const val M = 6
fun main() {
    //М цифра, если не цифра то выдаём ошибку
    if(M >= 0 && M <= 9){
        print("В числе " + N + " цифр " + M + " = ")
        println(digitCountInNumber(N, M))
    }else print("Ошибка")
}
 
import kotlin.math.*
//Количество цифр в числе
fun countNumb(number: Int): Int {
    if (number == 0){
        return 1
    }
    var numb:Int = number
    var counter:Int = 0
    while (numb > 0){
        numb/=10
        counter++
    }
    return counter
}
//Возвращает цифру числа по индексу начиная слева 
fun secondDigit(number: Int, k: Int): Int {
    var result:Int 
    var count:Int = countNumb(number)
    var numb:Int
    numb = (10.0).pow(count-k).toInt()
    result = number/numb
    result %= 10
    return result
}


fun isPalindrome(n: Int): Boolean {
    if (n < 0){
        return false
    }
    var numb =  countNumb(n)
    var k = numb/2
    while (k > 0){
        if(secondDigit(n,k) != secondDigit(n,numb-k+1)){
            return false
        }
        k--
    }
    return true
}
const val NUMB = 145541
fun main() {
    if(isPalindrome(NUMB)){
        println("Число $NUMB палиндром")
    }else{
        println("Число $NUMB не палиндром")
    }
}
