import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int a = T/300;
        int b = T%300/60;
        int c = T%300%60/10;

        StringBuilder sb= new StringBuilder();
        if(T%300%60%10 != 0) System.out.println(-1);
        else System.out.println(sb.append(a).append(" ").append(b).append(" ").append(c));
    }
}