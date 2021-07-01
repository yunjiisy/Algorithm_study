import java.util.Scanner;
import java.util.Arrays;
public class num_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        for(int i =0;i<10;i++){
            num[i] = sc.nextInt();
            num[i] = num[i]%42;
        }

        Arrays.sort(num);
        int count = 1;
        for(int i = 1;i<10;i++){
            if(num[i]!=num[i-1]){
                count++;
            }
        }
        System.out.println(count);



    }
}
