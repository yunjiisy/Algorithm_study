import java.util.Scanner;

public class num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0; i<n;i++){
            a[i]=sc.nextInt();
        }
        Test t = new Test();
        System.out.println(t.sum(a));

    }

}
class Test{
    long sum(int[] a){
        long sum = 0;
        for(int i = 0;i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }
}
