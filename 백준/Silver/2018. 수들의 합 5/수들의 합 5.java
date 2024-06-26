import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i=1, j=1, sum=1, count = 1;
        while(j < N){
            if(sum > N){
                sum -= i++;
            }
            else if(sum < N){
                sum += ++j;
            }
            else{
                count++; sum += ++j;
            }
        }
        System.out.println(count);
    }
}