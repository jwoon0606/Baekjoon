import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int[] odds = Arrays.stream(arr).filter(idx -> idx % 2 != 0).sorted().toArray();

        if(odds.length == 0) {
            System.out.println(-1);
            return;
        }

        for(int i : odds) {
            sum += i;
        }
        sb.append(sum).append("\n").append(odds[0]);

        System.out.println(sb);
    }
}