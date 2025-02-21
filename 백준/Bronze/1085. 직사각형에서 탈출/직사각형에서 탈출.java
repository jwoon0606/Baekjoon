import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cor = new int[4];
        for (int i = 0; i < 4; i++) {
            cor[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Math.min(Math.min(cor[3]-cor[1],cor[2]-cor[0]),Math.min(cor[0],cor[1])));
    }
}