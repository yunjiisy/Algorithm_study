import java.util.Scanner;
public class num_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =0;i<a; i++){
            for(int t = 0; t<i+1; t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
