/* Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел.

Пример.
Исходный массив:

4, 2, 7, 5, 1, 3, 8, 6, 9
Результаты:

[1, 2, 3, 4, 5, 6, 7, 8, 9]
Minimum is 1
Maximum is 9*/

package Seminar3HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Seminar3hwTask3 {
    public static void analyzeNumbers(Integer[] arr){
//        Integer[] workArr =Arrays.copyOf(arr,arr.length);
        List<Integer> resultList = Arrays.asList(arr);
        Collections.sort(resultList);
        StringBuilder sb = new StringBuilder();
        sb.append(resultList+"\n");
        sb.append("Minimum is " + Collections.min(resultList)+"\n");
        sb.append("Maximum is " + Collections.max(resultList)+"\n");
        int sum = 0;
        for (Integer item: resultList)
            sum+=item;
        sb.append("Average is = "+ sum/resultList.size());
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Integer[] arr = {12,4,10,5,22};
        System.out.println(Arrays.asList(arr));
        analyzeNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }
}


//    List<Integer> resultList = Arrays.asList(workArr);
////        resultList.addAll(Arrays.asList(arr));
////        Collections.copy(resultList,Arrays.asList(arr));
//        System.out.println(resultList);
//                resultList.set(0,2);
//                System.out.println(resultList);
//                resultList.remove(0);
//int s = IntStream.of(arr).sum();

//
//    Не все тесты пройдены, есть ошибки :(
//
//
//        Количество затраченных попыток: 1
//
//        Время выполнения: 15.457407 сек
//
//        Общая статистика
//        Всего тестов: 4. Пройдено: 0. Не пройдено: 4.
//
//        Подробную информацию по каждому тесту смотрите ниже.
//
//        Тест 1
//        Тест не пройден ✗
//
//        Формулировка:
//
//        * Аргументы, передаваемые в метод/функцию:
//
//
//        '4, 2, 7, 5, 1, 3, 8, 6, 9'
//
//
//        * Итоговый код для проверки. Иногда добавляем что-то от себя :)
//
//        import java.util.Arrays;
//        import java.util.ArrayList;
//
//
//        import java.util.Arrays;
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.List;
//
//class Answer {
//    public static void analyzeNumbers(Integer[] arr) {
//        // Введите свое решение ниже
////        Integer[] workArr =Arrays.copyOf(arr,arr.length);
//        List resultList = Arrays.asList(arr);
//        Collections.sort(resultList);
//        StringBuilder sb = new StringBuilder();
//        sb.append(resultList+"\n");
//        sb.append("Minimum is " + Collections.min(resultList)+"\n");
//        sb.append("Maximum is " + Collections.max(resultList)+"\n");
//        double sum = 0;
//        for (Integer item: resultList)
//            sum+=item;
//        sb.append("Average is = "+ sum/resultList.size());
//        System.out.println(sb);
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.analyzeNumbers(arr);
//    }
//} // Проверяем решение
//
//    Ожидаемый ответ:
//
//        [1, 2, 3, 4, 5, 6, 7, 8, 9]
//        Minimum is 1
//        Maximum is 9
//        Average is = 5
//
//        Ваш ответ:
//
//        [1, 2, 3, 4, 5, 6, 7, 8, 9]
//        Minimum is 1
//        Maximum is 9
//        Average is = 5.0
//        Тест 2
//        Тест не пройден ✗
//
//        Формулировка:
//
//        * Аргументы, передаваемые в метод/функцию:
//
//
//        '-2, -1, 0, 1, 2, 3, 4, 5'
//
//
//        * Итоговый код для проверки. Иногда добавляем что-то от себя :)
//
//        import java.util.Arrays;
//        import java.util.ArrayList;
//
//
//        import java.util.Arrays;
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.List;
//
//class Answer {
//    public static void analyzeNumbers(Integer[] arr) {
//        // Введите свое решение ниже
////        Integer[] workArr =Arrays.copyOf(arr,arr.length);
//        List resultList = Arrays.asList(arr);
//        Collections.sort(resultList);
//        StringBuilder sb = new StringBuilder();
//        sb.append(resultList+"\n");
//        sb.append("Minimum is " + Collections.min(resultList)+"\n");
//        sb.append("Maximum is " + Collections.max(resultList)+"\n");
//        double sum = 0;
//        for (Integer item: resultList)
//            sum+=item;
//        sb.append("Average is = "+ sum/resultList.size());
//        System.out.println(sb);
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.analyzeNumbers(arr);
//    }
//} // Проверяем решение
//
//    Ожидаемый ответ:
//
//        [-2, -1, 0, 1, 2, 3, 4, 5]
//        Minimum is -2
//        Maximum is 5
//        Average is = 1
//
//        Ваш ответ:
//
//        [-2, -1, 0, 1, 2, 3, 4, 5]
//        Minimum is -2
//        Maximum is 5
//        Average is = 1.5
//        Тест 3
//        Тест не пройден ✗
//
//        Формулировка:
//
//        * Аргументы, передаваемые в метод/функцию:
//
//
//        '10, 20, 30, 40, 50'
//
//
//        * Итоговый код для проверки. Иногда добавляем что-то от себя :)
//
//        import java.util.Arrays;
//        import java.util.ArrayList;
//
//
//        import java.util.Arrays;
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.List;
//
//class Answer {
//    public static void analyzeNumbers(Integer[] arr) {
//        // Введите свое решение ниже
////        Integer[] workArr =Arrays.copyOf(arr,arr.length);
//        List resultList = Arrays.asList(arr);
//        Collections.sort(resultList);
//        StringBuilder sb = new StringBuilder();
//        sb.append(resultList+"\n");
//        sb.append("Minimum is " + Collections.min(resultList)+"\n");
//        sb.append("Maximum is " + Collections.max(resultList)+"\n");
//        double sum = 0;
//        for (Integer item: resultList)
//            sum+=item;
//        sb.append("Average is = "+ sum/resultList.size());
//        System.out.println(sb);
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.analyzeNumbers(arr);
//    }
//} // Проверяем решение
//
//    Ожидаемый ответ:
//
//        [10, 20, 30, 40, 50]
//        Minimum is 10
//        Maximum is 50
//        Average is = 30
//
//        Ваш ответ:
//
//        [10, 20, 30, 40, 50]
//        Minimum is 10
//        Maximum is 50
//        Average is = 30.0
//        Тест 4
//        Тест не пройден ✗
//
//        Формулировка:
//
//        * Аргументы, передаваемые в метод/функцию:
//
//
//        '1, 3, 5, 7, 9'
//
//
//        * Итоговый код для проверки. Иногда добавляем что-то от себя :)
//
//        import java.util.Arrays;
//        import java.util.ArrayList;
//
//
//        import java.util.Arrays;
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.List;
//
//class Answer {
//    public static void analyzeNumbers(Integer[] arr) {
//        // Введите свое решение ниже
////        Integer[] workArr =Arrays.copyOf(arr,arr.length);
//        List resultList = Arrays.asList(arr);
//        Collections.sort(resultList);
//        StringBuilder sb = new StringBuilder();
//        sb.append(resultList+"\n");
//        sb.append("Minimum is " + Collections.min(resultList)+"\n");
//        sb.append("Maximum is " + Collections.max(resultList)+"\n");
//        double sum = 0;
//        for (Integer item: resultList)
//            sum+=item;
//        sb.append("Average is = "+ sum/resultList.size());
//        System.out.println(sb);
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.analyzeNumbers(arr);
//    }
//} // Проверяем решение
//
//    Ожидаемый ответ:
//
//        [1, 3, 5, 7, 9]
//        Minimum is 1
//        Maximum is 9
//        Average is = 5
//
//        Ваш ответ:
//
//        [1, 3, 5, 7, 9]
//        Minimum is 1
//        Maximum is 9
//        Average is = 5.0