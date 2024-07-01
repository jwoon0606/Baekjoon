import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ca = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : ca) {
            if(Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else if(Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
        }
        System.out.println(sb);
    }
}