import java.util.Scanner;

public class num_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0;i<T;i++){
            int R = sc.nextInt();
            String S =sc.next();
            for(int t = 0;t<S.length();t++){
                for(int a = 0;a<R;a++){
                    System.out.print(S.charAt(t));
                }
            }
            System.out.println();
        }
    }
}
