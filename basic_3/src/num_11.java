import java.util.Scanner;
public class num_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int [] n = new int[N];
        for(int i = 0; i<=N-1;i++){
            n[i] = sc.nextInt();
        }
        for(int i=0;i<=N-1;i++){
            if(n[i]<x){
                System.out.print(n[i]+" ");
            }

        }
    }
}
