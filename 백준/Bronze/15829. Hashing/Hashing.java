import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BigInteger r = new BigInteger("31");
        BigInteger M = new BigInteger("1234567891");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();

        BigInteger hashValue = new BigInteger("0");
        for (int i = 0; i < l; i++) {
            char c = str.charAt(i);
            int temp = c - 'a' + 1;
            BigInteger value = new BigInteger(String.valueOf(temp));
            for (int j = 0; j < i; j++) {
                value = value.multiply(new BigInteger("31"));
            }
            hashValue = hashValue.add(value);
        }

        hashValue = hashValue.remainder(M);

        StringBuilder sb = new StringBuilder();
        sb.append(hashValue.toString()).append("\n");
        System.out.print(sb);
    }
}
