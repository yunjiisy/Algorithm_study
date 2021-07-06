import java.util.Scanner;

public class num_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int t = 0;

        for(int i = 0;i<num.length();i++){
            char a = num.charAt(i);
            if(a=='A'||a=='B'||a=='C'){
                t+=3;
            }
            else if(a=='D'||a=='E'||a=='F'){
                t+=4;
            }
            else if(a=='G'||a=='H'||a=='I'){
                t+=5;
            }
            else if(a=='J'||a=='K'||a=='L'){
                t+=6;
            }
            else if(a=='M'||a=='N'||a=='O'){
                t+=7;
            }
            else if(a>='P'&&a<='S'){
                t+=8;
            }
            else if(a=='T'||a=='U'||a=='V'){
                t+=9;
            }
            else if(a=='W'||a=='X'||a=='Y'||a=='Z'){
                t+=10;
            }
        }
        System.out.println(t);
    }
}
