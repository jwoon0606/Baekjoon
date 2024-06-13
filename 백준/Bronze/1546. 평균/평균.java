import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] scores = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int maxScore = scores[0];
        for(int i=1; i<size; i++){
            if(scores[i] > maxScore)
                maxScore = scores[i];
        }

        double sum = 0;
        for(int i=0; i<size; i++){
            sum += (double)scores[i] / maxScore * 100;
        }
        double average = sum / size;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(average));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}