import java.util.Scanner;
import java.util.Arrays;
public class num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] n = new int[N];
//        int M=0;
//        int m=999999;
//        for(int i =0; i<N;i++){
//            n[i]= sc.nextInt();
//            if(n[i]>M){
//                M=n[i];
//            }
//            if(n[i]<m){
//                m = n[i];
//            }
//
//        }
        for(int i =0;i<N;i++){
            n[i]=sc.nextInt();
        }
        Arrays.sort(n);

        System.out.println(n[0] +" "+ n[N-1]);
    }
}
