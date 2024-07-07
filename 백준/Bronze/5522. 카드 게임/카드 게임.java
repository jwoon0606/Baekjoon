import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int sum = 0;
        while ((str = br.readLine()) != null) {
            int a = Integer.parseInt(str);
            sum += a;
        }
        System.out.println(sum);
    }
}