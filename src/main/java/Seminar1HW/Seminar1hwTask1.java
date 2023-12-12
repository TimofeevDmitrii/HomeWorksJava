/* Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.

Пример


n = 4 -> 10

n = 5 -> 15*/


package Seminar1HW;

public class Seminar1hwTask1 {
    public static int countNTriangle(double m){
        double sum=((1 + m) / 2) * (m);
        int int_sum= (int) Math.round(sum);
        return int_sum;
    }
//    public static int countNTriangle(int m){
//        int sum=0;
//        for (int i=1; i<=m; i++){
//            sum += i;
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countNTriangle(n));
    }
}
//countNTriangle