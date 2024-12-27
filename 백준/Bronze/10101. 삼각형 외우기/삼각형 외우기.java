import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        if(A + B + C == 180) {
            if(A == B && B == C) {
                sb.append("Equilateral");
            } else if (A == B || B == C || C == A) {
                sb.append("Isosceles");
            } else {
                sb.append("Scalene");
            }
        } else {
            sb.append("Error");
        }

        System.out.println(sb);
    }
}