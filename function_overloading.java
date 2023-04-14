import java.util.Scanner;

public class function_overloading {
   
    public static void area(int a , int b) {
        int  c = a*b;
        System.out.println("area of a rectangle is "+c);
    }
    public static void area(int x){

        int y = x*x;
          System.out.println("area of a sqare is "+y);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length and breadth of a rectangle"); 
        int a = sc.nextInt();
        int  b = sc.nextInt();
        System.out.println("enter the length of a square");
         int x = sc.nextInt();

         area(a, b);
         area(x);
    }
}