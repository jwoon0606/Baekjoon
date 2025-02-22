import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < N - i - 1) sb.append(" ");
                else sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < i) sb.append(" ");
                else sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}