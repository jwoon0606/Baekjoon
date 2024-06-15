import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for(int i=0; i<N; i++){
            basket[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            while(J - I > 0) {
                int temp = basket[I-1];
                basket[I-1] = basket[J-1];
                basket[J-1] = temp;
                I++;
                J--;
            }

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < basket.length; i++) {
            sb.append(basket[i]).append(" ");
        }
        sb.append("\n");

        System.out.print(sb);
    }
}
