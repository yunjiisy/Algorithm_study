import java.util.Scanner;

public class num_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String A = "";
        String B = "";
        for(int i =a.length()-1;i>=0;i--){
            A = A+a.charAt(i);
        }
        for(int i = b.length()-1;i>=0;i--){
            B = B+b.charAt(i);
        }
        int c = Integer.parseInt(A)+Integer.parseInt(B);
        System.out.println(c);

    }

}
