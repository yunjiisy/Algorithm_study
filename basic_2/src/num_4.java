import java.util.Scanner;
public class num_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>0&b>0){
            System.out.println("1");
        }
        else if(a<0&b>0){
            System.out.println("2");
        }
        else if(a<0&b<0){
            System.out.println("3");
        }
        else if(a>0&b<0){
            System.out.println("4");
        }

    }
}
