import java.util.Scanner;



public class area_of_circle {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double pi = 3.14;
        double area = (a*a)*pi;
        System.out.print(area);

    }
}
