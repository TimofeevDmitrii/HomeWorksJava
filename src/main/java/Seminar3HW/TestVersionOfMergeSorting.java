/* В данном коде реализован алгоритм похожий на алгоритм сортировки слияием. Разница в том, что
здесь в качестве точки разделения массива на левую и правую части выбирается не середина, а случайный индекс
элемента в массиве(за исключением последнего элемента в массиве). При слиянии происходит лишь сложение двух массивов
без буфера, как в классическом алгоритме сортировки слиянием. Проверяется лишь условие: последний элемент левой части
должен быть меньше первого элемента правой части, иначе мы должны их поменять местами. После слияния с помощью метода
sortedArr() проверяется сортировка массива. Если он не отсортирован, то получвшийся массив прогоняется через код еще раз.
Таким образом, в начале массив разбивается на подчасти, а затем каждая подчасть будет отсортирована на собственном подуровне.
Конечно, данный алгоритм очень не рационален, но работает =) Сложность алгоритма примерно О(n^3). Но количетсво
итераций может сильно варьироваться в зависимости от расположения элементов и подбора случайной точки разделения.
 */

package Seminar3HW;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TestVersionOfMergeSorting {
    private static File file = new File("mergeTest.txt");
    private static FileWriter fw;
    public static boolean sortedArr(int[] array){
        boolean sorted=true;
        int n=0;
        while(n<array.length-1 && sorted){
            if (array[n]>array[n+1])
                sorted=false;
            n++;
        }
        return sorted;
    }

    public static int[] mergeSort(int[] numArray) throws IOException {
        fw = new FileWriter(file, true);
        if (numArray.length<=1)
            return numArray;
//        if (numArray.length<=2){
//            if (numArray.length==2)
//                if (numArray[0] > numArray[1]) {
//                    int temp = numArray[0];
//                    numArray[0] = numArray[1];
//                    numArray[1] = temp;
//                }
//            return numArray;
//        }
        else if (sortedArr(numArray))
            return numArray;
        else {
            while(!sortedArr(numArray)) {
                int minValue = 1;
                int maxValue = numArray.length-1;
                int curr_middle = minValue + (int) (Math.random() * (maxValue - minValue + 1));
//                if (numArray.length % 2 != 0)
//                    curr_middle = numArray.length / 2;
//                else
//                    curr_middle = numArray.length / 2 + 1;
                int[] left_part = new int[curr_middle];
                int[] right_part = new int[numArray.length - curr_middle];
                for (int i = 0; i < curr_middle; i++)
                    left_part[i] = numArray[i];
                for (int i = 0; i < numArray.length - curr_middle; i++)
                    right_part[i] = numArray[i + curr_middle];
                left_part = mergeSort(left_part);
                right_part = mergeSort(right_part);
                if (left_part[curr_middle - 1] > right_part[0]) {
                    int[] tempArray = left_part;
                    left_part = right_part;
                    right_part = tempArray;
                }
                for (int i = 0; i < left_part.length; i++)
                    numArray[i] = left_part[i];
                for (int i = 0; i < right_part.length; i++)
                    numArray[i + left_part.length] = right_part[i];
                System.out.println(Arrays.toString(numArray));
                fw.write(new StringBuilder().append(Arrays.toString(numArray)).append("\n").toString());
                fw.flush();
            }
            return numArray;
            }
    }

    public static void main(String[] args) throws IOException {
        int[] arrayTest=new int[]{1,6,21,3,2,10,1,8,4,0,5,7,2,11,6,8,3}; // {1,6,7,2,2,11,6,8,3,4} {1,8,5,7,2,1,4,5} {1,6,21,3,2,10,1,8,4,0,5,7,2,11,6,8,3}
        System.out.println(Arrays.toString(arrayTest));
        System.out.println(Arrays.toString(mergeSort(arrayTest)));
    }
}
