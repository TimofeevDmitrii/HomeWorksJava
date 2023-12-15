/*В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.

Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.


calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)

// 10.0
// 11.0
// 10.0

calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)

// 6.0
// 3.0
// 6.0*/

package Seminar4HW;

import java.util.ArrayDeque;
import java.util.Deque;

public class Seminar4hwTask3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

//        a = 3;
//        op = '+';
//        b = 7;
//        c = 4;
//        op2 = '+';
//        d = 7;
//        undo = '<';

        a = 3;
        op = '*';
        b = 2;
        c = 7;
        op2 = '-';
        d = 4;
        undo = '<';

        Calculator calculator = new Calculator();

        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);


//        dq.add(13);
//        dq.add(12);
//        dq.add(13);
//        dq.addFirst(17);
//        dq.addLast(19);
//        System.out.println(dq);
//        System.out.println(dq.peek());
//        System.out.println(dq.peekFirst());
//        System.out.println(dq.pollLast());
    }
}
