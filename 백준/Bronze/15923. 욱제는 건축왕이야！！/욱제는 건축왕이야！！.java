import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int preX = X, preY = Y;
        int sol = 0;
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer((br.readLine()));
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            sol += Math.sqrt(Math.pow(preX - x,2) + Math.pow(preY - y,2));
            preX = x; preY = y;
        }
        sol += Math.sqrt(Math.pow(preX - X,2) + Math.pow(preY - Y,2));
        System.out.println(sol);
    }
}