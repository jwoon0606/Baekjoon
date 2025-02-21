import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A >= B) {
            if(B >= C) System.out.println(B);
            else if(A >= C) System.out.println(C);
            else System.out.println(A);
        } else {
            if(A >= C) System.out.println(A);
            else if(B >= C) System.out.println(C);
            else System.out.println(B);
        }
    }
}