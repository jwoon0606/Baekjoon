import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String tString = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(tString);
        int tCount = 0;
        for (int i = 0; i < 6; i++) {
            int a = Integer.parseInt(st.nextToken());
            while(a > 0) {
                a -= T;
                tCount++;
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(tCount).append("\n").append(N/P).append(" ").append(N%P);
        System.out.println(sb);
    }
}