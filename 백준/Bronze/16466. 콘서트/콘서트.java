import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[N+2];
        for (int i = 1; i <= N; i++) {
            BigInteger a = new BigInteger(st.nextToken());
            if(a.intValue() <= N)
                arr[a.intValue()] = true;
        }
        for (int i = 1; i <= N+2; i++) {
            if(!arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}