import java.util.Scanner;

public class num_2 {
    public static void main(String[] args) {
        int arr [] = new int[10001];
       for(int i =1;i<=10000;i++){
           int j=i;
           while(j<10000){
               int a = j;
               int t = 0;

               while(a>0){
                   t = a%10;
                   j +=t;
                   a/=10;
               }
               if(j<10000){
                   arr[j] = j;
               }
               else{
                   break;
               }
           }
       }
       for(int i = 1;i<10000;i++){
           if(arr[i]==0){
               System.out.println(i);
           }
       }


    }
}
