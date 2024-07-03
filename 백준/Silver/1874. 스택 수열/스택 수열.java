import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int ready_num = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
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