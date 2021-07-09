//소수 합과 최소값
import java.util.Scanner;

public class num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = 10000;
        int sum = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                } else if (i == j) {

                    if (min > i) {
                        min = i;
                    }
                    sum = sum + i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
