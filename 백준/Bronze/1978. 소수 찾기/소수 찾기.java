import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            int temp = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= temp; j++) {
                if(temp % j == 0) count++;
            }
            if(count == 2) result++;
        }
        System.out.println(result);
    }
}