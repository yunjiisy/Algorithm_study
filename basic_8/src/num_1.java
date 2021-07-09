//손익분기점
import java.util.Scanner;

public class num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(c>b){
            int d = a/(c-b)+1;
            System.out.println(d);
        }
        else{
            System.out.println(-1);
        }


    }
}
