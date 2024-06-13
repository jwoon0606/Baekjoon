import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int need = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if((60 - m) > need){
            bw.write(h + " " + (m+need));
        }
        else{
            h += ((need - (60 - m)) / 60 + 1);
            if(h >= 24)
                h -= 24;
            m = ((need - (60 - m)) % 60);
            bw.write(h + " " + m);
        }

        bw.newLine();
        bw.flush();
        bw.close();
    }
}