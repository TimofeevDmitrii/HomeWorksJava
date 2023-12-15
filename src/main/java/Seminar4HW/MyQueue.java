package Seminar4HW;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    static Queue<Integer> queue = new LinkedList<>();

    public static void enqueue(Integer element){
        // Напишите свое решение ниже
        queue.add(element);
    }

    public static Integer dequeue(){
        // Напишите свое решение ниже
        return queue.remove();
    }

    public static Integer first(){
        // Напишите свое решение ниже
        return queue.element();
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return (LinkedList<Integer>) queue;
    }
}
