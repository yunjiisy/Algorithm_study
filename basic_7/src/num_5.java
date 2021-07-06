import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class num_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        S = S.toUpperCase(Locale.ROOT);
        int [] a = new int[100];

        for(int i =65; i<=90; i++){
            int t = 0;
            while(t<S.length()){
                if((int)S.charAt(t)==i){
                    a[i]++;
                }
                t++;
            }
        }

        int m =0;
        for(int i =66;i<90;i++){
            if(a[i]>a[i-1]){

                m = i;
            }
        }
        System.out.println((char)m);
    }
}
