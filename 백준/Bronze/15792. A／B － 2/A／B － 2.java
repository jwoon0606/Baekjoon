import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal N = new BigDecimal(st.nextToken());
        BigDecimal M = new BigDecimal(st.nextToken());
        System.out.println(N.divide(M,10001,BigDecimal.ROUND_DOWN));
    }
}