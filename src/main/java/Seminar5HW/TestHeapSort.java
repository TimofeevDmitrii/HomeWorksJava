package Seminar5HW;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHeapSort {

    public static ArrayList<Integer[]> createParentsAndChilds(Integer[] arr) {
        ArrayList<Integer[]> resultLst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Integer[] ParentAndChilds = new Integer[3];
            if (2 * i + 1 < arr.length || 2 * i + 2 < arr.length) {
                ParentAndChilds[0] = arr[i];
                if (2 * i + 1 < arr.length)
                    ParentAndChilds[1] = arr[2 * i + 1];
                if (2 * i + 2 < arr.length)
                    ParentAndChilds[2] = arr[2 * i + 2];
                resultLst.add(ParentAndChilds);
            }
            else
                break;

        }
        return resultLst;
    }

    public static int[] createSortingTree(int[] arr) {
        int[] treeParAndChilds = Arrays.copyOf(arr, arr.length);
        int elementsQuantity = 0;
        int pow2=0;
//        2^0+2^1+2^2+2^3...
        while ( elementsQuantity<treeParAndChilds.length){
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
            while (2 * tempIndex + 1 < treeParAndChilds.length || 2 * tempIndex + 2 < treeParAndChilds.length) {
                int currIndex = tempIndex;
                int tempNum = treeParAndChilds[tempIndex];
                int maxIndex;
                if (2 * tempIndex + 1 < treeParAndChilds.length && 2 * tempIndex + 2 < treeParAndChilds.length){
                    if (treeParAndChilds[2 * tempIndex + 1] < treeParAndChilds[2 * tempIndex + 2])
                        maxIndex = 2 * tempIndex + 2;
                    else
                        maxIndex = 2 * tempIndex + 1;
                }
                else{
                    if (2 * tempIndex + 1 < treeParAndChilds.length)
                        maxIndex=2 * tempIndex + 1;
                    else
                        maxIndex=2 * tempIndex + 2;
                }
                if (treeParAndChilds[tempIndex]<treeParAndChilds[maxIndex]) {
                    treeParAndChilds[tempIndex] = treeParAndChilds[maxIndex];
                    treeParAndChilds[maxIndex]=tempNum;
                    tempIndex=maxIndex;
                }
                if (currIndex==tempIndex)
                    break;
            }
        }
        return treeParAndChilds;
    }

    public static void printSortingTree(int[] arr){
        int index = 0;
        StringBuilder sb = new StringBuilder();
        int pow2=0;
        int numOfSpace = 60;
        while (index<arr.length){
            for (int t=0; t<numOfSpace; t++)
                sb.append(" ");
            for (int i=0; i<Math.pow(2,pow2); i++){
                sb.append(arr[index++]);
                for (int s = 0; s < numOfSpace; s++)
                    sb.append(" ");
                if (index>=arr.length)
                    break;
            }
            for (int t=0; t<numOfSpace; t++)
                sb.append(" ");
            sb.append("\n");
            pow2++;
            numOfSpace= (int) ((120-Math.pow(2,pow2))/(Math.pow(2,pow2)+1)); //
        }
        System.out.println(sb);
    }

    public static int[] heapSort(int[] sortArr){
        int[] newArr = Arrays.copyOf(sortArr, sortArr.length);
        int[] sortTree;
        int temp;
        for (int i=0; i<newArr.length; i++) {
            sortTree = createSortingTree(Arrays.copyOfRange(newArr,0,newArr.length-i));
            for (int k=0; k<sortTree.length;k++)
                newArr[k]=sortTree[k];
            temp = newArr[0];
            newArr[0]=newArr[newArr.length-1-i];
            newArr[newArr.length-1-i]=temp;
        }
        return newArr;
    }


    public static void main(String[] args) {
/*
        Integer[] testArr = {0,1,6,7,1,8,9,2,10,1,4,9};
        for (Integer[] item: createParentsAndChilds(testArr))
            System.out.println(Arrays.toString(item));
*/
        int[] testArr = {0,-1,6,-7,3,5,8,30,9,2,0,-3,10,5,-4,9,-2,8,4,7,12,1,6,7,2,1};; //{0,1,6,7,3,8,9,2,10,5,4,9,2,8,4,12,1,6,7,2,1};
        int[] sortedArr=heapSort(testArr);
        System.out.println(Arrays.toString(testArr));
        printSortingTree(createSortingTree(testArr));
        System.out.println(Arrays.toString(sortedArr));
        printSortingTree(createSortingTree(sortedArr));

    }
}
