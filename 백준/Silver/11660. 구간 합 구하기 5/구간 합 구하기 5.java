import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrN = Integer.parseInt(st.nextToken());
        int quizN = Integer.parseInt(st.nextToken());

        int[][] A = new int[arrN+1][arrN+1];
        for (int i = 1; i <= arrN; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<= arrN; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int D[][] = new int[arrN+1][arrN+1];
        for(int i=1; i<=arrN; i++) {
            for(int j=1; j<=arrN; j++) {
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<quizN; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            sb.append(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}