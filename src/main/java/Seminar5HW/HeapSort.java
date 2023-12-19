package Seminar5HW;

import java.util.Arrays;

public class HeapSort {
    public static void buildTree(int[] tree) {
        // Введите свое решение ниже
        int elementsQuantity = 0;
        int pow2=0;
//        2^0+2^1+2^2+2^3...
        while ( elementsQuantity<tree.length){
            elementsQuantity+=Math.pow(2,pow2++);
        }
//        System.out.println(pow2);

        int previousRate = pow2-1;
        int lastIndexPreviousRate = 0;
        pow2=0;
        while (pow2<previousRate){
            lastIndexPreviousRate+=Math.pow(2,pow2++);
        }
//        System.out.println(lastIndexPreviousRate);

        for (int i=lastIndexPreviousRate-1; i>=0; i--) {
            int tempIndex = i;
            while (2 * tempIndex + 1 < tree.length || 2 * tempIndex + 2 < tree.length) {
                int currIndex = tempIndex;
                int tempNum = tree[tempIndex];
                int maxIndex;
                if (2 * tempIndex + 1 < tree.length && 2 * tempIndex + 2 < tree.length){
                    if (tree[2 * tempIndex + 1] < tree[2 * tempIndex + 2])
                        maxIndex = 2 * tempIndex + 2;
                    else
                        maxIndex = 2 * tempIndex + 1;
                }
                else{
                    if (2 * tempIndex + 1 < tree.length)
                        maxIndex=2 * tempIndex + 1;
                    else
                        maxIndex=2 * tempIndex + 2;
                }
                if (tree[tempIndex]<tree[maxIndex]) {
                    tree[tempIndex] = tree[maxIndex];
                    tree[maxIndex]=tempNum;
                    tempIndex=maxIndex;
                }
                if (currIndex==tempIndex)
                    break;
            }
        }
    }

    public static void heapSort(int[] sortArray) {
        int[] sortTree;
        int temp;
        for (int i=0; i<sortArray.length; i++) {
            sortTree = Arrays.copyOfRange(sortArray,0,sortArray.length-i);
            buildTree(sortTree);
            for (int k=0; k<sortTree.length;k++)
                sortArray[k]=sortTree[k];
            temp = sortArray[0];
            sortArray[0]=sortArray[sortArray.length-1-i];
            sortArray[sortArray.length-1-i]=temp;
        }
    }
}
