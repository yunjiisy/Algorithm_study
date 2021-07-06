import java.util.Scanner;

public class num_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == 'c') {
                if (i < S.length() - 1) {
                    if (S.charAt(i + 1) == '=') {
                        i++;
                    } else if (S.charAt(i + 1) == '-') {
                        i++;
                    }
                }

            } else if (S.charAt(i) == 'd') {
                if (i < S.length() - 1) {
                    if (S.charAt(i + 1) == 'z') {
                        if (i < S.length() - 2) {
                            if (S.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }
                    else if (S.charAt(i + 1) == '-') {
                        i++;
                    }
                }

            } else if (S.charAt(i) == 'l') {
                if(i<S.length()-1){
                    if (S.charAt(i + 1) == 'j') {
                        i++;
                    }
                }

            } else if (S.charAt(i) == 'n') {
                if(i<S.length()-1){
                    if (S.charAt(i + 1) == 'j') {
                        i++;
                    }
                }


            } else if (S.charAt(i) == 's') {
                if(i<S.length()-1){
                    if (S.charAt(i + 1) == '=') {
                        i++;
                    }
                }

            } else if (S.charAt(i) == 'z') {
                if(i<S.length()-1){
                    if (S.charAt(i + 1) == '=') {
                        i++;
                    }
                }

            }
            count++;
        }

        System.out.println(count);
    }

}
