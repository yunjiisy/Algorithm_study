import java.util.Scanner;

public class num_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number num = new Number();
        int a = sc.nextInt();
        System.out.println(num.number(a));
    }
}
class Number{
    int number(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 99) {
                count++;
            }
            else if(i==1000){
                break;
            }
            else {
                if(i%10-i/10%10==i/10%10-i/100){
                    count++;
                }
            }
        }
        return count;
    }
}
