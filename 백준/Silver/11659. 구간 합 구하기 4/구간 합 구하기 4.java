import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S = new int[N];
        st = new StringTokenizer(br.readLine());
        S[0] = Integer.parseInt(st.nextToken());
        for(int i=1; i<N; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            if(I <= 1)
                sb.append(S[J-1]);
            else
                sb.append(S[J-1] - S[I-2]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}