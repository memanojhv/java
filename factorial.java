import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int prod = 1;
        for(int i=1;i<=n;i++){
          
             prod = prod*i;
        }
        return prod;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        System.out.println(fact(n));
    }
}
