import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        int[] a = new int[26];
        Arrays.fill(a, -1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i) - 'a';
            if(a[ch] == -1)
                a[ch] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            sb.append(i).append(" ");
        }
        sb.append("\n");
        System.out.print(sb);
    }
}
