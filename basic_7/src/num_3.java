import java.util.Scanner;
public class num_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        for(int i = 97;i<=122;i++){
            int t = 0;
            while(t<S.length()){
                if((int)S.charAt(t)==i){
                    System.out.print(t+" ");
                    break;
                }
                else if((int)S.charAt(t)!=i&&t==S.length()-1){
                    System.out.print(-1+" ");
                }
                t++;
            }
        }

    }
}
