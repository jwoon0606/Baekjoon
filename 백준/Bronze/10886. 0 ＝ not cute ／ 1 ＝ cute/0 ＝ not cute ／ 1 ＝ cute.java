import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int zeroCount = 0;
        for (int i = 0; i < N; i++) {
            if(Integer.parseInt(br.readLine()) == 0) zeroCount++;
        }

        if(zeroCount > N / 2) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
    }
}