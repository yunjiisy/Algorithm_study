import java.util.Scanner;

public class num_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double x1 = sc.nextInt();
            double y1 = sc.nextInt();
            double r1 = sc.nextInt();
            double x2 = sc.nextInt();
            double y2 = sc.nextInt();
            double r2 = sc.nextInt();
            double r3 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            if(r3!=0){
                if(r1+r2>r3){
                    System.out.println(2);
                }
                else if(r1+r2<r3){
                    System.out.println(0);
                }
                else if(r1+r2==r3){
                    System.out.println(1);
                }
            }
            else{
                if (r1 == r2) {
                    System.out.println(-1);
                }
                else{
                    System.out.println(0);
                }

            }
        }


    }
}
