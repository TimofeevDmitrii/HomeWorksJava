/* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

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


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;  // удаленная из языка библиотека

public class Seminar2hwTask2AutoTestTask {

    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        try {
            log = new File("log.txt");
            fileWriter = new FileWriter(log);
            int count = 0;
            boolean sorted=false;
            while (count != mas.length && sorted==false) {
                sorted=true;
                int temp;
                for (int i = 0; i < mas.length - 1 - count; i++) {
                    if (mas[i] > mas[i + 1]) {
                        temp = mas[i + 1];
                        mas[i + 1] = mas[i];
                        mas[i] = temp;
                        sorted=false;
                    }
                }
//            String result_str= Arrays.toString(mas);
                StringBuilder sb = new StringBuilder();
                LocalDateTime dateAndTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                String resultDateTime = dateAndTime.format(formatter);
                sb.append(resultDateTime+" ");
                sb.append(Arrays.toString(mas) + "\n");
                fileWriter.append(sb);
                fileWriter.flush();
                count++;
            }
        } catch (IOException ioException)  {
            ioException.printStackTrace();
        }
    }



//        private static File log;
//    private static FileWriter fileWriter;

//    public static void sort(int[] mas) {
//        try {
//            log = new File("log.txt");
//            fileWriter = new FileWriter(log);
//            int count = 0;
//            boolean sorted=false;
//            while (count != mas.length && sorted==false) {
//                sorted=true;
//                int temp;
//                for (int i = 0; i < mas.length - 1 - count; i++) {
//                    if (mas[i] > mas[i + 1]) {
//                        temp = mas[i + 1];
//                        mas[i + 1] = mas[i];
//                        mas[i] = temp;
//                        sorted=false;
//                    }
//                }
////            String result_str= Arrays.toString(mas);
//                StringBuilder sb = new StringBuilder();
//                Date date = new Date();
//                sb.append(date.getYear() + "-");
//                sb.append(date.getMonth() + "-");
//                sb.append(date.getDay() + " ");
//                sb.append(date.getHours() + ":");
//                sb.append(date.getMinutes() + " ");
//                sb.append(Arrays.toString(mas) + "\n");
//                fileWriter.append(sb);
//                fileWriter.flush();
//                count++;
//            }
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws IOException {
        int[] numArr=new int[] {9, 3, 4, 8, 2, 5, 7, 1, 6, 10}; // 5,3,8,25,2,0,0,100,1,4,7,2,6,1,8,5,10
        sort(numArr);
    }
}
//
//    Не все тесты пройдены, есть ошибки :(
//
//
//        Количество затраченных попыток: 1
//
//        Время выполнения: 15.313085 сек
//
//        Общая статистика
//        Всего тестов: 3. Пройдено: 0. Не пройдено: 3.
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
//        '9, 4, 8, 3, 1'
//
//
//        * Итоговый код для проверки. Иногда добавляем что-то от себя :)
//
//
//        import java.io.File;
//        import java.io.FileWriter;
//        import java.io.FileReader;
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.util.Arrays;
//        import java.text.SimpleDateFormat;
//        import java.util.Date;
//        import java.time.LocalDateTime;
//        import java.time.format.DateTimeFormatter;
//
//class BubbleSort {
//    private static File log;
//    private static FileWriter fileWriter;
//
//    public static void sort(int[] mas) {
//        try {
//            log = new File("log.txt");
//            fileWriter = new FileWriter(log);
//            int count = 0;
//            while (count != mas.length - 1) {
//                int curr_num;
//                int temp;
//                for (int i = 0; i < mas.length - 1 - count; i++) {
//                    if (mas[i] > mas[i + 1]) {
//                        temp = mas[i + 1];
//                        mas[i + 1] = mas[i];
//                        mas[i] = temp;
//                    }
//                }
////            String result_str= Arrays.toString(mas);
//                StringBuilder sb = new StringBuilder();
//                LocalDateTime dateAndTime = LocalDateTime.now();
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//                String resultDateTime = dateAndTime.format(formatter);
//                sb.append(resultDateTime+" ");
//                sb.append(Arrays.toString(mas) + "\n");
//                fileWriter.append(sb);
//                fileWriter.flush();
//                count++;
//            }
//        } catch (IOException ioException)  {
//            ioException.printStackTrace();
//        }
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        int[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new int[]{9, 4, 8, 3, 1};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
//        }
//
//        BubbleSort ans = new BubbleSort();
//        ans.sort(arr);
//
//        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//} // Проверяем решение
//
//
//    Ожидаемый ответ:
//
//        2023-12-06 09:40 [4, 8, 3, 1, 9]
//        2023-12-06 09:40 [4, 3, 1, 8, 9]
//        2023-12-06 09:40 [3, 1, 4, 8, 9]
//        2023-12-06 09:40 [1, 3, 4, 8, 9]
//        2023-12-06 09:40 [1, 3, 4, 8, 9]
//
//        Ваш ответ:
//
//        2023-12-06 09:40 [4, 8, 3, 1, 9]
//        2023-12-06 09:40 [4, 3, 1, 8, 9]
//        2023-12-06 09:40 [3, 1, 4, 8, 9]
//        2023-12-06 09:40 [1, 3, 4, 8, 9]
//        Тест 2
//        Тест не пройден ✗
//
//        Формулировка:
//
//        * Аргументы, передаваемые в метод/функцию:
//
//
//        '9, 3, 4, 8, 2, 5, 7, 1, 6, 10'
//
//
//        * Итоговый код для проверки. Иногда добавляем что-то от себя :)
//
//
//        import java.io.File;
//        import java.io.FileWriter;
//        import java.io.FileReader;
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.util.Arrays;
//        import java.text.SimpleDateFormat;
//        import java.util.Date;
//        import java.time.LocalDateTime;
//        import java.time.format.DateTimeFormatter;
//
//class BubbleSort {
//    private static File log;
//    private static FileWriter fileWriter;
//
//    public static void sort(int[] mas) {
//        try {
//            log = new File("log.txt");
//            fileWriter = new FileWriter(log);
//            int count = 0;
//            while (count != mas.length - 1) {
//                int curr_num;
//                int temp;
//                for (int i = 0; i < mas.length - 1 - count; i++) {
//                    if (mas[i] > mas[i + 1]) {
//                        temp = mas[i + 1];
//                        mas[i + 1] = mas[i];
//                        mas[i] = temp;
//                    }
//                }
////            String result_str= Arrays.toString(mas);
//                StringBuilder sb = new StringBuilder();
//                LocalDateTime dateAndTime = LocalDateTime.now();
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//                String resultDateTime = dateAndTime.format(formatter);
//                sb.append(resultDateTime+" ");
//                sb.append(Arrays.toString(mas) + "\n");
//                fileWriter.append(sb);
//                fileWriter.flush();
//                count++;
//            }
//        } catch (IOException ioException)  {
//            ioException.printStackTrace();
//        }
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        int[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new int[]{9, 4, 8, 3, 1};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
//        }
//
//        BubbleSort ans = new BubbleSort();
//        ans.sort(arr);
//
//        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//} // Проверяем решение
//
//
//    Ожидаемый ответ:
//
//        2023-12-06 09:40 [3, 4, 8, 2, 5, 7, 1, 6, 9, 10]
//        2023-12-06 09:40 [3, 4, 2, 5, 7, 1, 6, 8, 9, 10]
//        2023-12-06 09:40 [3, 2, 4, 5, 1, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [2, 3, 4, 1, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [2, 3, 1, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [2, 1, 3, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//
//        Ваш ответ:
//
//        2023-12-06 09:40 [3, 4, 8, 2, 5, 7, 1, 6, 9, 10]
//        2023-12-06 09:40 [3, 4, 2, 5, 7, 1, 6, 8, 9, 10]
//        2023-12-06 09:40 [3, 2, 4, 5, 1, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [2, 3, 4, 1, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [2, 3, 1, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [2, 1, 3, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        Тест 3
//        Тест не пройден ✗
//
//        Формулировка:
//
//        * Аргументы, передаваемые в метод/функцию:
//
//
//        '10, 9, 8, 7, 6, 5, 4, 3, 2, 1'
//
//
//        * Итоговый код для проверки. Иногда добавляем что-то от себя :)
//
//
//        import java.io.File;
//        import java.io.FileWriter;
//        import java.io.FileReader;
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.util.Arrays;
//        import java.text.SimpleDateFormat;
//        import java.util.Date;
//        import java.time.LocalDateTime;
//        import java.time.format.DateTimeFormatter;
//
//class BubbleSort {
//    private static File log;
//    private static FileWriter fileWriter;
//
//    public static void sort(int[] mas) {
//        try {
//            log = new File("log.txt");
//            fileWriter = new FileWriter(log);
//            int count = 0;
//            while (count != mas.length - 1) {
//                int curr_num;
//                int temp;
//                for (int i = 0; i < mas.length - 1 - count; i++) {
//                    if (mas[i] > mas[i + 1]) {
//                        temp = mas[i + 1];
//                        mas[i + 1] = mas[i];
//                        mas[i] = temp;
//                    }
//                }
////            String result_str= Arrays.toString(mas);
//                StringBuilder sb = new StringBuilder();
//                LocalDateTime dateAndTime = LocalDateTime.now();
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//                String resultDateTime = dateAndTime.format(formatter);
//                sb.append(resultDateTime+" ");
//                sb.append(Arrays.toString(mas) + "\n");
//                fileWriter.append(sb);
//                fileWriter.flush();
//                count++;
//            }
//        } catch (IOException ioException)  {
//            ioException.printStackTrace();
//        }
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        int[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new int[]{9, 4, 8, 3, 1};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
//        }
//
//        BubbleSort ans = new BubbleSort();
//        ans.sort(arr);
//
//        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//} // Проверяем решение
//
//
//    Ожидаемый ответ:
//
//        2023-12-06 09:40 [9, 8, 7, 6, 5, 4, 3, 2, 1, 10]
//        2023-12-06 09:40 [8, 7, 6, 5, 4, 3, 2, 1, 9, 10]
//        2023-12-06 09:40 [7, 6, 5, 4, 3, 2, 1, 8, 9, 10]
//        2023-12-06 09:40 [6, 5, 4, 3, 2, 1, 7, 8, 9, 10]
//        2023-12-06 09:40 [5, 4, 3, 2, 1, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [4, 3, 2, 1, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [3, 2, 1, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [2, 1, 3, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//
//        Ваш ответ:
//
//        2023-12-06 09:40 [9, 8, 7, 6, 5, 4, 3, 2, 1, 10]
//        2023-12-06 09:40 [8, 7, 6, 5, 4, 3, 2, 1, 9, 10]
//        2023-12-06 09:40 [7, 6, 5, 4, 3, 2, 1, 8, 9, 10]
//        2023-12-06 09:40 [6, 5, 4, 3, 2, 1, 7, 8, 9, 10]
//        2023-12-06 09:40 [5, 4, 3, 2, 1, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [4, 3, 2, 1, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [3, 2, 1, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [2, 1, 3, 4, 5, 6, 7, 8, 9, 10]
//        2023-12-06 09:40 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]