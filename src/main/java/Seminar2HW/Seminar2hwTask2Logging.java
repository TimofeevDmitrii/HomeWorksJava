/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.

Пример


arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]*/

package Seminar2HW;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Seminar2hwTask2Logging {

    private static final Logger LOG = Log.log(Seminar2hwTask2Logging.class.getName());

    public static void sort(int[] mas) {
        int count=0;
        while (count!= mas.length-1){
            int curr_num;
            int temp;
            for (int i=0; i<mas.length-1-count; i++){
                if (mas[i]>mas[i+1]){
                    temp=mas[i+1];
                    mas[i+1]=mas[i];
                    mas[i]=temp;
                }
            }
            String result_str=Arrays.toString(mas);
            LOG.log(Level.INFO,result_str);
            count++;
        }
    }

    public static void main(String[] args) {
        int[] numArr=new int[] {5,3,8,25,2,0,0,100,1,4,7,2,6,1,8,5,10}; //
        sort(numArr);
//        String result_str=Arrays.toString(numArr);
//        System.out.println(result_str);
    }
}
