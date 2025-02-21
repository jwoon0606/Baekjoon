import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a + b + c < 100) {
            int lowest = Math.min(a,Math.min(b,c));
            if(lowest == a) System.out.println("Soongsil");
            else if(lowest == b) System.out.println("Korea");
            else System.out.println("Hanyang");

        } else {
            System.out.println("OK");
        }
    }
}