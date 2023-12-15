package Seminar4HW;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {

    static Deque<Double> deque = new ArrayDeque<>();

    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        if (op == '+')
            deque.add((double) a + b);
        else if (op == '-')
            deque.add((double) a - b);
        else if (op == '*')
            deque.add((double) a * b);
        else if (op=='/')
            deque.add((double) a / b);
        else if (op == '<')
            deque.removeLast();
        return deque.getLast();
    }
}
