import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str = (N == 0) ? "YONSEI" : "Leading the Way to the Future";
        sb.append(str).append("\n");
        System.out.print(sb);
    }
}