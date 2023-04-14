public class whileloop {
    public static void main(String[]args) {
        int a =0;
        while(a<=100){
            System.out.println(a);
            a++;
            if(a==50){
                continue;
            }
        }
    }
}
