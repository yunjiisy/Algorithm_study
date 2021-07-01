import java.util.Scanner;
import java.util.Arrays;
public class num_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        float [] score = new float[N];
        for(int i = 0; i<N;i++){
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        float sum = 0;
        for(int t=0; t<N; t++){
            score[t]=(score[t]/score[N-1])*100;
            sum = sum+score[t];
        }
        System.out.println(sum/N);

    }
}
