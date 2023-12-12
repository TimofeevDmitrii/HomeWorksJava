/*Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

Напишите свой код в методе printPrimeNums класса Answer.

Пример

2
3
5
7
11
... */

package Seminar1HW;

public class Seminar1hwTask2 {
    public static void printPrimeNums(){
        for (int i=2; i<1000; i++){
            int d=2;
            boolean flag=true;
            while ((d*d<=i) && (flag==true)){
                if (i%d==0)
                    flag = false;
                d+=1;
            }
            if (flag==true)
                System.out.println(i);
        }

    }
    public static void main(String[] args) {
        printPrimeNums();
    }
}
