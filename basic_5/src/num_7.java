import java.util.Scanner;

public class num_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j= 0;j<t;j++){
            int N = sc.nextInt();
            float sum =0;
            float count = 0;
            float [] score = new float[N];
            for(int i =0;i<N;i++){
                score[i]=sc.nextInt();
                sum = sum +score[i];
            }
            float avr = sum/N;
            for(int a=0;a<N;a++){
                if(score[a]>avr){
                    count++;
                }
            }

            System.out.printf("%.3f%%",count/N*100);
        }

    }
}
