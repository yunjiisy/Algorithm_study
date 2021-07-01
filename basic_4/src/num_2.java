import java.util.Scanner;
public class num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //종료조건x->=정수 아닌 값 들어오면 종료(더이상 읽어 올 데이터가 없을 때)
        //hasNextInt = Scanner객체 입력값이 int일때만 true반환
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
