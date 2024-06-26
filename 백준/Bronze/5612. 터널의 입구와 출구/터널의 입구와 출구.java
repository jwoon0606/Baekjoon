import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int remain = Integer.parseInt(br.readLine());
        int max = remain;
        for (int i = 0; i < T; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            remain += Integer.parseInt(st.nextToken());
            remain -= Integer.parseInt(st.nextToken());
            if(remain < 0) {
                max = 0;
                break;
            }
            max = Math.max(max,remain);
        }
        System.out.println(max);
    }
}