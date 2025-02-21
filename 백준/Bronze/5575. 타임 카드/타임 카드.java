import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            int enter = Integer.parseInt(st.nextToken()) * 60 * 60 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
            int out = Integer.parseInt(st.nextToken()) * 60 * 60 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
            int work = out - enter;
            int hour = work / 3600;
            int minute = (work - hour*60*60) / 60;
            int second = (work - hour*60*60 - minute*60);

            sb.append(hour).append(" ").append(minute).append(" ").append(second).append("\n");
        }

        System.out.print(sb);
    }
}