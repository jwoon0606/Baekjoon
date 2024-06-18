import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        int mul = 1;
        for(int i=0; i<3; i++){
            int num = Integer.parseInt(br.readLine());
            mul *= num;
        }

        String str = String.valueOf(mul);
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}