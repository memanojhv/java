import java.util.Scanner;


public class switchstate {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
       String a = sc.next();
            switch(a){
                case "manoj": System.out.println("you have selected manoj");
                break;
                case "rahul": System.out.println("you have selected rahul");
                break;
                case "rohit": System.out.println("you have selected rohit");
                break;
                case "ram": System.out.println("you have selected ram");
                break;
                case "ramesh": System.out.println("you have selected ramesh");
                break;
                default : System.out.println("select a valid name");
            }
    }
}
