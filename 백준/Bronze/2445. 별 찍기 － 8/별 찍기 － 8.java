import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringBuilder temp;
        for (int i = 0; i < 2*N - 1; i++) {
            temp = new StringBuilder();
            int starCount = 0;
            int spaceCount = 0;
            if(i < N) {
                starCount = i+1;
                spaceCount = N-i-1;
            } else {
                int I = i - N + 1;
                starCount = N - I;
                spaceCount = I;
            }

            temp.append("*".repeat(starCount)).append(" ".repeat(spaceCount));
            sb.append(temp).append(temp.reverse()).append("\n");
        }

        System.out.print(sb);
    }
}