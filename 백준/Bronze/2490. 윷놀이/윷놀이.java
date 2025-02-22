import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int count = 0;
            String result = "";
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                if(Integer.parseInt(st.nextToken()) == 0) {
                    count++;
                }
            }
            switch (count) {
                case 0 : {
                    result = "E";
                    break;
                }
                case 1 : {
                    result = "A";
                    break;
                }
                case 2 : {
                    result = "B";
                    break;
                }
                case 3 : {
                    result = "C";
                    break;
                }
                case 4 : {
                    result = "D";
                    break;
                }
            }

            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}