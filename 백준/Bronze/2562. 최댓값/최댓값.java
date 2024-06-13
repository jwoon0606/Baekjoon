import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[9];

        int maxIndex;
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        maxIndex = 0;
        for (int i = 1; i < 9; i++) {
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(nums[maxIndex]).append("\n");
        sb.append(maxIndex+1);
        System.out.print(sb);

    }
}
