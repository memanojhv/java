import java.util.Scanner;

public class function {
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        int a , b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.println(c);

    
        
    }
    public static void sub(){
        Scanner sc = new Scanner(System.in);
       int a,b,c;
       a = sc.nextInt();
        b = sc.nextInt();
        c = a-b;
        System.out.println(c);
}
    public static void main(String args []) {
        sum();
        sub();
    }
}