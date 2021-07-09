//소수 에라토스테네스의 체
import java.util.Scanner;


public class num_4 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int minbound = sc.nextInt();
       int maxbound = sc.nextInt();
       int [] num = new int[maxbound+1];
       num[1]=1;
        for (int i = 2; i*i <= maxbound; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                } else if (i == j) {
                    for (int k = i*2; k <= maxbound; k+=i) {
                        num[k]++;
                    }
                }
            }
        }
       for(int i =minbound;i<=maxbound;i++){
           if(num[i]==0){
               System.out.println(i);
           }
       }


    }
}
