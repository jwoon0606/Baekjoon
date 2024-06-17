import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        String str = "abcdefghijklmnopqrstuvwxyz";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int n = -1;
            for (int j = 0; j < S.length(); j++) {
                if(str.charAt(i) == S.charAt(j)){
                    n = j;
                    break;
                }
            }
            sb.append(n).append(" ");
        }
        sb.append("\n");

        System.out.print(sb);
    }
}
