import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] x = new String[3];
        String[] y = new String[3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] =st.nextToken();
            y[i] =st.nextToken();
        }
        String targetx;
        String targety;

        if(x[0].equals(x[1])) {
            targetx = x[2];
        } else if(x[0].equals(x[2])) {
            targetx = x[1];
        } else {
            targetx = x[0];
        }

        if(y[0].equals(y[1])) {
            targety = y[2];
        } else if(y[0].equals(y[2])) {
            targety = y[1];
        } else {
            targety = y[0];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(targetx).append(" ").append(targety).append("\n");
        System.out.print(sb);
    }
}