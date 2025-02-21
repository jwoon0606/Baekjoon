import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int chicken = Integer.parseInt(br.readLine());

        if(A+B < chicken*2) System.out.println(A+B);
        else System.out.println(A + B - chicken*2);
    }
}