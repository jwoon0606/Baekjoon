import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int target = 1;
        int count = 1;
        int plus = 6;
        while(N > target) {
            target += plus;
            plus += 6;
            count++;
        }
        System.out.println(count);
    }
}