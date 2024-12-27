import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i=0; i<4; i++) {
            int a = Integer.parseInt(br.readLine());
            sum += a;
        }

        int m = sum / 60;
        int s = sum % 60;

        StringBuilder sb = new StringBuilder();
        sb.append(m).append("\n").append(s);
        System.out.println(sb);
    }
}