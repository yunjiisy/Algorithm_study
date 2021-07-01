import java.util.Scanner;
public class num_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a*b*c;

        int t=0;
        int [] count = new int[10];
        while(d>0){
            count[d%10]++;
            d =d/10;
        }
        for(int i =0;i<10;i++){
            System.out.println(count[i]);
        }




    }
}
