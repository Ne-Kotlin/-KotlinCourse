import kotlin.math.*

fun seconds(hours: Int, minutes: Int, seconds: Int): Int? {
   val DAY_SECOND = 86400
   var second = hours * 3600 + minutes * 60 + seconds
   if (second >= DAY_SECOND){
       return null
   }else{
       return second
   }
}


fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    var value = sqrt((x2-x1).pow(2.0) +(y2-y1).pow(2.0))
    return value
}

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
//Вторая цифра слева от числа
fun secondDigit(number: Int): Int {
    var result:Int 
    var count:Int = countNumb(number)
    var numb:Int
    numb = (10.0).pow(count-2).toInt()
    result = number/numb
    result %= 10
    return result
}

fun numberRevert(number: Int): Int {
    var count:Int = countNumb(number)
    var numb:Int
    var result:Int = 0
    var value:Int = number    
    var num:Int //последняя цифра числа 
    numb = (10.0).pow(count-1).toInt()
    while (value > 0){
        num = value % 10
        value /= 10 

        result += num*numb
        numb /= 10
    }
    return result
}

//Константы для поиска секунд
const val HOURS = 24
const val MINUTES = 1
const val SECONDS = 30
//Кординаты начала и конца отрезка
const val X1 = 9.0
const val X2 = 3.0
const val Y1 = 8.0
const val Y2 = 2.0
//Для поиска второй цифры слева
const val VALUE1 = 8374
//Для разворота числа
const val VALUE2 = 876
fun main() {
    var sec = seconds(HOURS, MINUTES, SECONDS)
    if (sec == null){
        println("Ошибка")
    }else{
        println("Прошло секунд:" + sec)
    }
    println("Длина Отрезка:" + trackLength(X1, Y1, X2, Y2))
    var digit = secondDigit(VALUE1) 
    if (VALUE1 >= 100) {
        println("Вторая цифра слева:" + digit)
    }else{
        println("Ошибка")
    }
    if (VALUE2 > 99 && VALUE2 < 1000){
        println("Обратное число:" + numberRevert(VALUE2))
    }else{
        println("Ошибка")
    }
    
}
