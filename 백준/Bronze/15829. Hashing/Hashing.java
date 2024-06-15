import com.sun.security.jgss.GSSUtil;

import javax.lang.model.type.IntersectionType;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        final int r = 31;
        final long M = 1234567891;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long hashValue = 0;
        for (int i = 0; i < l; i++) {
            char c = str.charAt(i);
            long value = c -'a' + 1;
            for (int j = 0; j < i; j++) {
                value *= r;
            }
            hashValue += value;
        }

        hashValue %= M;

        StringBuilder sb = new StringBuilder();
        sb.append(hashValue).append("\n");
        System.out.print(sb);
    }
}
