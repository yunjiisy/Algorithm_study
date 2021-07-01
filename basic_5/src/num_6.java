import java.util.Scanner;

public class num_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //sc.nextLine(); //개행문자(엔터)를 제거하기 위해 추가함.
        //입력의 마지막 엔터를 제거하지 않아서 다음에 호출 된 nextLine메소드의
        //입력으로 처리되서 문제 발생
        String[] s = new String[N];
        for(int i =0;i<N;i++){
            s[i] = sc.next();
        }

        int i =0;
        int sum = 0;
        int count = 0;
        for(int t=0;t<N;t++){
            while(i<s[t].length()){
                if(s[t].charAt(i)=='o'){
                    count++;
                    sum = sum+count;
                }
                else{
                    count =0;
                }
                i++;
            }

            System.out.println(sum);
            count =0;
            sum =0;
            i=0;

        }




    }

}
