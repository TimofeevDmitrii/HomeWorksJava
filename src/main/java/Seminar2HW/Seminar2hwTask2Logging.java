package Seminar2HW;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Seminar2hwTask2Logging {

    private static final Logger LOG = Log.log(Seminar2hwTask2Logging.class.getName());

    public static void sort(int[] mas) {
        int count=0;
        while (count!= mas.length-1){
            int curr_num;
            int temp;
            for (int i=0; i<mas.length-1-count; i++){
                if (mas[i]>mas[i+1]){
                    temp=mas[i+1];
                    mas[i+1]=mas[i];
                    mas[i]=temp;
                }
            }
            String result_str=Arrays.toString(mas);
            LOG.log(Level.INFO,result_str);
            count++;
        }
    }

    public static void main(String[] args) {
        int[] numArr=new int[] {5,3,8,25,2,0,0,100,1,4,7,2,6,1,8,5,10}; //
        sort(numArr);
//        String result_str=Arrays.toString(numArr);
//        System.out.println(result_str);
    }
}
