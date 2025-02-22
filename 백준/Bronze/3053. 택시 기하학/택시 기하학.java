import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        final double PI = 3.14159265359;
        sb.append(String.format("%5f",r*r*PI)).append("\n").toString();
        sb.append(String.format("%5f",r*r*2.0)).append("\n");
        System.out.print(sb);
    }
}