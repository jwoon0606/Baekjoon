import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int ready_num = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n >= ready_num){
                while(ready_num <= n) {
                    stack.push(ready_num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if(n == stack.pop())
                    sb.append("-\n");
                else{
                    sb = new StringBuilder("NO\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}