import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringBuilder sb = new StringBuilder();
        while((str = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str);
            long N = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            int count = 0;
            long n = N;
            while(n>=k){
                n -= k;
                n++;
                count++;
            }
            N += count;
            sb.append(N).append("\n");
        }
        System.out.println(sb);

    }
}