import java.io.*;
public class num_04 {
    public static void main(String[] args) throws Exception  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());

        for(int i = 1;i<=a;i++){
            String s = bf.readLine();
            int b = Integer.parseInt(s.split(" ")[0]);
            int c = Integer.parseInt(s.split(" ")[1]);
            bw.write((b+c)+"\n");
        }
        bw.flush();
    }
}
