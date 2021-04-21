import kotlin.math.*
const val YEAR_1 = "год"
const val YEAR_2 = "года"
const val YEAR_3 = "лет"

fun ageDescription(age: Int): String {
    //берём последние 2 цифры числа, находим первое из них
    if((age % 100)/10 == 1){
        return YEAR_3
    }
    //Находим первую цифру с конца
    
return when (age % 10) {
   1 -> YEAR_1
   in 2..4 -> YEAR_2
   0, in 5..9 -> YEAR_3
   else -> "Ошибка"
}




}

const val AGE = 200

fun main() {
    if(AGE > 0 && AGE < 200){
        print(AGE.toString()+" ")
        println(ageDescription(AGE))
    }
    else{
        print("Ошибка");
    }
}
 
fun triangleKind(a: Double, b: Double, c: Double): Int {
    
    if ( a == 0.0 || b == 0.0 || c == 0.0 || a+b+c != 180.0){
        return -1
    }
    
    if (a < 90.0 && b < 90.0 && c < 90.0 ) {
        return 0
    }else if(a > 90.0 || b > 90.0 ||c > 90.0) {
        return 1
    }else{
        return -1
    }
}

const val A = 55.5
const val B = 60.0
const val C = 64.5


fun main() {
    when (triangleKind(A, B, C)) {
       0 -> print("Треугольник остроугольный")
       1 -> print("Треугольник тупоугольный")
       -1 -> print("Треугольник не существует")
    }
}
 
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean = when {
    ((a <= r && b <= s) || (b <= r && a <= s)) -> true
    ((b <= r && c <= s) || (c <= r && b <= s)) -> true
    ((c <= r && a <= s) || (a <= r && c <= s)) -> true
    else -> false
}

const val HIGHT_A = 2
const val WIDTH_B = 5
const val LENGHT_C = 4

const val HIGHT_PORT_A = 3
const val WIDTH_PORT_B = 5

fun main() {
    if(HIGHT_A > 0 && WIDTH_B > 0 && LENGHT_C > 0 && HIGHT_A > 0 && WIDTH_B > 0){
        var test = brickPasses(HIGHT_A, WIDTH_B, LENGHT_C, HIGHT_A, WIDTH_B)
        if (test == true) {
            println("Кирпич пройдёт")
        }else{
            println("Кирпич не пройдёт")
        }
    }
}
