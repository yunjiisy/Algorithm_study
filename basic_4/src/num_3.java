import java.util.Scanner;
public class num_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int b;
        int c;
        int d = a;
        while(true) {
            if (d < 10) {
                b = d;
            }
            else {
                b = ((d / 10) + (d % 10))%10;
            }
            d = (d % 10) * 10 + b;

            if(d == a){
                count++;
                break;
            }
            else{
                count++;
            }

        }
        System.out.println(count);
    }
}
