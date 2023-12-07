package Seminar1HW;

public class Seminar1hwTask2 {
    public static void printPrimeNums(){
        for (int i=2; i<1000; i++){
            int d=2;
            boolean flag=true;
            while ((d*d<=i) && (flag==true)){
                if (i%d==0)
                    flag = false;
                d+=1;
            }
            if (flag==true)
                System.out.println(i);
        }

    }
    public static void main(String[] args) {
        printPrimeNums();
    }
}
