import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];

        for(byte val : br.readLine().getBytes()){
            int s;
            if((char)val >= 'A' && (char)val <= 'Z')
                s = (char)val - 'A';
            else
                s = (char)val - 'a';
            count[s]++;
        }

        int max = count[0];
        int max_i = 0;
        for (int i = 1; i < count.length; i++) {
            if(count[i] > max){
                max = count[i];
                max_i = i;
            }
        }

        for(int i=0; i<count.length; i++){
            if(max == count[i] && i != max_i){
                System.out.println("?");
                return;
            }
        }

        System.out.println((char)(max_i + 'A'));
    }
}