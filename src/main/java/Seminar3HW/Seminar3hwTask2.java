/* Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.

Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>

Примеры.
Исходный массив:

1, 2, 3, 4, 5, 6, 7, 8, 9
Результат:

[1, 3, 5, 7, 9]
Исходный массив:

2, 4, 6, 8
Результат:

[]*/

package Seminar3HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seminar3hwTask2 {
    public static void removeEvenNumbers(Integer[] arr){
        List<Integer> resultList = new ArrayList<>();
        for (Integer item: Arrays.asList(arr))
            if (item%2!=0)
                resultList.add(item);
        System.out.println(resultList);
    }

    public static void main(String[] args) {
        Integer[] numArr = {1,2,3};
        removeEvenNumbers(numArr);
    }
}
