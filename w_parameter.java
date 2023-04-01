

import java.util.Scanner;

public class w_parameter {
    public static void sum(int a , int b) { //parameters
        int c = a+b;
        System.out.println(c);
    }
    public static void sub(int a , int b) {  //parameters
        int c = a-b;
        System.out.println(c);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
    sum(a, b);  //arguments
    sub(a, b);  //arguments
    }
}
