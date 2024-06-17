import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        StringBuilder sb = new StringBuilder();
        int w = 1;
        for (int i = 2; i >= 0; i--) {
            if(str1.charAt(i) > str2.charAt(i)){
                break;
            } else if(str1.charAt(i) < str2.charAt(i)) {
                w = 2;
                break;
            }
        }
        if(w == 1){
            for (int i = 2; i >= 0; i--) {
                sb.append(str1.charAt(i));
            }
        }else{
            for (int i = 2; i >= 0; i--) {
                sb.append(str2.charAt(i));
            }
        }

        sb.append("\n");
        System.out.print(sb);
    }
}
