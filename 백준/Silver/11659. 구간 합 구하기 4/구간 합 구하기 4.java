import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suN = Integer.parseInt(st.nextToken());
        int quizN = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] S = new int[suN+1];
        S[0] = 0;
        for(int i=1; i<=suN; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int q=0; q<quizN; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            sb.append(S[j] - S[i-1]);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}