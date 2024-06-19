import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int start;
        int end = str.length() - 1;
        for (start = 0; start <= end; start++) {
            if(str.charAt(start) != str.charAt(end))
                break;
            end--;
        }
        if(start > end)
            System.out.println(1);
        else
            System.out.println(0);

    }
}