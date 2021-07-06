import java.util.Scanner;

public class num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        for(int i =0;i<N;i++){
            // char->int
            int a = Character.getNumericValue(num.charAt(i));
            sum = sum+a;


        }
        System.out.println(sum);
    }
}
