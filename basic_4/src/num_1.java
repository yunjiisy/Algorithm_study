import java.util.Scanner;
public class num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=1;
        while(true){
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(b==0&c==0){
                break;
            }
            else{
                System.out.println(b+c);
            }
        }
    }

}
