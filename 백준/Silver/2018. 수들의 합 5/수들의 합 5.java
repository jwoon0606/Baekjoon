import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] s = new int[N];
        s[0] = 1;
        for (int i = 1; i < N; i++) {
            s[i] = i+1 + s[i-1];
        }

        int i=0, j=0, sum=0, count = 0;
        while(j < N){
            if(i == 0)
                sum = s[j];
            else
                sum = s[j] - s[i-1];
            if(sum > N)
                i++;
            else if(sum < N)
                j++;
            else{
                count++; j++;
            }
        }
        System.out.println(count);
    }
}