import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int max = 0;
        int[][] arr = new int [9][9];
        int I = 0;
        int J = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    I = i;
                    J = j;
                }
                max = Math.max(arr[i][j],max);
            }
        }

        sb.append(max).append("\n")
                .append(I+1).append(" ").append(J+1);
        System.out.println(sb);
    }
}