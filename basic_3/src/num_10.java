import java.util.Scanner;
public class num_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int t = a;t>=1;t--){
            for(int i = t-1;i>=1;i--){
                System.out.print(" ");
            }
            for(int s = 1; s<=a-(t-1);s++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
