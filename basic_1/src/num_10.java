import java.util.Scanner;
public class num_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println((a+b)%c +"\n" + ((a%c)+(b%c))%c);
        System.out.println((a*b)%c +"\n" + ((a%c)*(b%c))%c);

    }

}
