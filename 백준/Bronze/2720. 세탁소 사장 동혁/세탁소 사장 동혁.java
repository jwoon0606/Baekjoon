import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNY = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(C/QUARTER).append(" ").append(C%QUARTER/DIME).append(" ").append(C%QUARTER%DIME/NICKEL).append(" ").append(C%QUARTER%DIME%NICKEL/PENNY).append("\n");
        }

        System.out.print(sb);
    }
}