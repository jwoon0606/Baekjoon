import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append(S.length()).append("\n");
        System.out.print(sb);
    }
}
