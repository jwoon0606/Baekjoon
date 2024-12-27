import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = 0;
        for(int i=0; i<4; i++) {
            S += Integer.parseInt(st.nextToken());
        }
        int T = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            T += Integer.parseInt(st.nextToken());
        }

        System.out.println(Math.max(S, T));
    }
}