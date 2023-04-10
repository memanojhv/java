import java.util.Scanner;

public class binomialt {
    public static int binomialt (int n, int r) {
        int a = 1;
        for(int i= 1 ; i<=n; i++){
            a = a*i;
        }
        int b =1;
        for(int j = 1; j<=r;j++){
            b = b*j;
        }
        int c = n-r;
        int h=1;
        for (int k = 1;k<=h;k++){
            c = c*k;
        }
        int d = a/(c*b);
        return d;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int r  = sc.nextInt();
        binomialt(n, r);
        System.out.println(binomialt(n, r));

    }
}
