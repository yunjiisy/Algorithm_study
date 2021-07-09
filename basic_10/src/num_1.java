import java.util.Scanner;

public class num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Factorial(num));
    }
    static int Factorial(int num){
        if(num==1){
            return 1;
        }
        else if(num==0){
            return 1;
        }
        else{
            return num*Factorial(num-1);
        }
    }
}
