/* Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

Пример


a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]*/

package Seminar3HW;

import java.util.Arrays;

public class Seminar3hwTask1 {
    public static int[] mergeSort(int[] numArray){
        int[] resultArray = Arrays.copyOf(numArray, numArray.length);
        if (resultArray.length!=1 && resultArray.length!=0){
            int curr_middle = resultArray.length / 2;
            int[] left_part = new int[curr_middle];
            int[] right_part = new int[resultArray.length - curr_middle];
//            left_part=Arrays.copyOf(numArray,curr_middle);
            for (int i = 0; i < curr_middle; i++)
                left_part[i] = resultArray[i];
            for (int i = 0; i < resultArray.length - curr_middle; i++)
                right_part[i] = resultArray[i + curr_middle];
            left_part = mergeSort(left_part);
            right_part = mergeSort(right_part);
            int n = 0;
            int index_left = 0;
            int index_right = 0;
            while (index_left != left_part.length && index_right != right_part.length) {
                if (left_part[index_left] <= right_part[index_right])
                    resultArray[n++] = left_part[index_left++];
                else
                    resultArray[n++] = right_part[index_right++];
            }
            if (index_right == right_part.length)
                for (int k = index_left; k < left_part.length; k++)
                    resultArray[n++] = left_part[k];
            else
                for (int k = index_right; k < right_part.length; k++)
                    resultArray[n++] = right_part[k];
//            System.out.println(Arrays.toString(resultArray));
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arrayTest=new int[]{1,6,21,3,2,10,1,8,4,0,5,7,2,11,6,8,3}; // {1,8,5,7,2,1,4,5}
        System.out.println(Arrays.toString(arrayTest));
//        System.out.println(arrayTest.length);
        System.out.println(Arrays.toString(mergeSort(arrayTest)));
//        System.out.println(Arrays.toString(arrayTest));
    }
}
