import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] value = new int[26];
        for(int i=0; i<S.length(); i++) {
            value[S.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int a : value) {
            sb.append(a).append(' ');
        }

        System.out.println(sb);
    }
}