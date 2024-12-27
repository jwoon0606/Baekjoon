import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result = new StringBuilder();
        StringBuilder sb;

        while(true) {
            String str = br.readLine();
            if(str.equals("END")) break;

            sb = new StringBuilder(str).reverse();
            result.append(sb).append("\n");
        }

        System.out.print(result);
    }
}