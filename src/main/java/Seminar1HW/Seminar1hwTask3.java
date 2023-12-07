package Seminar1HW;

public class Seminar1hwTask3 {
    public static int calculate(char op, int a, int b){
        if (op == '+')
            return a + b;
        else if (op == '-')
            return a - b;
        else if (op == '*')
            return a * b;
        else if (op=='/')
            return a / b;
        else {
            System.out.print("Некорректный оператор: ");
//            int intOp = Character.getNumericValue(op);
            return op;
        }
    }

    public static void main(String[] args) {
        int m=12;
        int n=4;
        char oper='[';
        System.out.println(calculate(oper,m,n));
    }

}
