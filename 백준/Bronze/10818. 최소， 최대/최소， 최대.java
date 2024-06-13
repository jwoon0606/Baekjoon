import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int maxNum, minNum;
        maxNum = minNum = nums[0];
        for (int i = 1; i < n; i++) {
            if(nums[i] > maxNum)
                maxNum = nums[i];
            if(nums[i] < minNum)
                minNum = nums[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(minNum).append(" ").append(maxNum);
        System.out.print(sb);
    }
}
