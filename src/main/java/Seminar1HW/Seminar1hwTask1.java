package Seminar1HW;

public class Seminar1hwTask1 {
    public static int countNTriangle(double m){
        double sum=((1 + m) / 2) * (m);
        int int_sum= (int) Math.round(sum);
        return int_sum;
    }
//    public static int countNTriangle(int m){
//        int sum=0;
//        for (int i=1; i<=m; i++){
//            sum += i;
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countNTriangle(n));
    }
}
//countNTriangle