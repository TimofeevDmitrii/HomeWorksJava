//Дана строка sql-запроса:
//
//        select * from students where "
//        Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.
//
//        Пример:
//
//        {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
//        Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
//
//        String QUERY - начало SQL-запроса
//        String PARAMS - JSON с параметрами

package Seminar2HW;

public class Seminar2hwTask1 {
    public static StringBuilder answer(String QUERY, String PARAMS){ //(String QUERY, String PARAMS)
        String[] paramsArr=PARAMS.replace("{","").replace("}","").split(",");
        StringBuilder sb = new StringBuilder(QUERY);
        String[] keyValue;
        boolean appendToWhere=false;
        for (String item: paramsArr) {
            keyValue = item.split(":");
            keyValue[0] = keyValue[0].trim().replace("\"","");
            keyValue[1] = keyValue[1].trim().replace("\"","'");
            if (keyValue[1].equals("'null'")==false) {
                if (appendToWhere==true)
                    sb.append(" and "+keyValue[0] + "=" + keyValue[1]);
                else {
                    sb.append(keyValue[0] + "=" + keyValue[1]);
                    appendToWhere=true;
                }
            }
        }
        return sb;

    }
        // Напишите свое решение ниже
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS="{\"name\": \"Ivanov\", \"country\": \"null\", \"city\": \"Moscow\", \"age\": \"null\"}";
        String PARAMS1 = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(answer(QUERY, PARAMS));
        System.out.println(answer(QUERY, PARAMS1));
    }
}

/*
Не все тесты пройдены, есть ошибки :(


Количество затраченных попыток: 1

Время выполнения: 6.348433 сек

Общая статистика
Всего тестов: 2. Пройдено: 0. Не пройдено: 2.

Подробную информацию по каждому тесту смотрите ниже.

Тест 1
Тест не пройден ✗

Формулировка:

* Аргументы, передаваемые в метод/функцию:


'select * from students where '
'{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}'


* Итоговый код для проверки. Иногда добавляем что-то от себя :)


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
      String[] paramsArr=PARAMS.replace("{","").replace("}","").split(",");
        StringBuilder sb = new StringBuilder(QUERY);
        String[] keyValue;
        boolean appendToWhere=false;
        for (String item: paramsArr) {
            keyValue = item.split(":");
            keyValue[0] = keyValue[0].trim();
            keyValue[1] = keyValue[1].trim();
            if (keyValue[1].equals("\"null\"")==false) {
                if (appendToWhere==true)
                    sb.append(" and "+keyValue[0] + "=" + keyValue[1]);
                else {
                    sb.append(keyValue[0] + "=" + keyValue[1]);
                    appendToWhere=true;
                }
            }
        }
        return sb;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
	public static void main(String[] args) {
      String QUERY = "";
      String PARAMS = "";

      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }

      Answer ans = new Answer();
      System.out.println(ans.answer(QUERY, PARAMS));
	}
} // Проверяем решение


Ожидаемый ответ:

select * from students where name='Ivanov' and country='Russia' and city='Moscow'

Ваш ответ:

select * from students where "name"="Ivanov" and "country"="Russia" and "city"="Moscow"
Тест 2
Тест не пройден ✗

Формулировка:

* Аргументы, передаваемые в метод/функцию:


'select * from students1111 where '
'{"name":"Andron", "country":"Russia", "city":"Moscow", "age":"null"}'


* Итоговый код для проверки. Иногда добавляем что-то от себя :)


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
      String[] paramsArr=PARAMS.replace("{","").replace("}","").split(",");
        StringBuilder sb = new StringBuilder(QUERY);
        String[] keyValue;
        boolean appendToWhere=false;
        for (String item: paramsArr) {
            keyValue = item.split(":");
            keyValue[0] = keyValue[0].trim();
            keyValue[1] = keyValue[1].trim();
            if (keyValue[1].equals("\"null\"")==false) {
                if (appendToWhere==true)
                    sb.append(" and "+keyValue[0] + "=" + keyValue[1]);
                else {
                    sb.append(keyValue[0] + "=" + keyValue[1]);
                    appendToWhere=true;
                }
            }
        }
        return sb;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
	public static void main(String[] args) {
      String QUERY = "";
      String PARAMS = "";

      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }

      Answer ans = new Answer();
      System.out.println(ans.answer(QUERY, PARAMS));
	}
} // Проверяем решение


Ожидаемый ответ:

select * from students1111 where name='Andron' and country='Russia' and city='Moscow'

Ваш ответ:

select * from students1111 where "name"="Andron" and "country"="Russia" and "city"="Moscow"
 */