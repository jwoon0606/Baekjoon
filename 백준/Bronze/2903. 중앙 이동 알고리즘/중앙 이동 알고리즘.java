import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 2;
        for (int i = 1; i <= N; i++) {
            count = count * 2 - 1;
        }

        System.out.println(count*count);
    }
}