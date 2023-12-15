/*Дан LinkedList с несколькими элементами разного типа. В методе revert класса LLTasks реализуйте разворот этого списка без использования встроенного функционала.

Пример


// Дан
[1, One, 2, Two]

// Вывод
[1, One, 2, Two]
[Two, 2, One, 1]*/

package Seminar4HW;

import java.util.Collections;
import java.util.LinkedList;

public class Seminar4hwTask1 {

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> resLinList = new LinkedList<>();
        for (int i=ll.size()-1; i>=0; i--)
            resLinList.add(ll.get(i));
        return resLinList;
    }

    public static void main(String[] args) {
        LinkedList<Object> linLst = new LinkedList<>();
        linLst.add(1);
        linLst.add("One");
        linLst.add(2);
        linLst.add("Two");
        System.out.println(linLst);
        System.out.println(revert(linLst));
//        Collections.reverse(linLst);
//        System.out.println(linLst);
    }
}
