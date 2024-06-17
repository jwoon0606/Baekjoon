import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S;
        StringBuilder sb = new StringBuilder();
        while((S = br.readLine()) != null){
            sb.append(S).append("\n");
        }
        System.out.print(sb);
    }
}