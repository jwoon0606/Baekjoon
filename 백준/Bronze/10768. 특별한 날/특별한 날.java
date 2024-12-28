import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        if(month < 2) sb.append("Before");
        else if(month > 2) sb.append("After");
        else {
            if(day < 18) sb.append("Before");
            else if(day > 18) sb.append("After");
            else sb.append("Special");
        }

        System.out.println(sb);
    }
}