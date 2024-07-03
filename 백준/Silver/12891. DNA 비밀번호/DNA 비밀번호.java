import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int[] myAry = new int[4];
    static int[] checkAry = new int[4];
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] str = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkAry[i] = Integer.parseInt(st.nextToken());
        }

        //setting
        for (int i = 0; i < P; i++) {
            addCount(str[i]);
        }

        //check
        if(checkCount()) count++;

        //slide
        for (int i = P; i < S; i++) {
            int preI= i - P ;
            addCount(str[i]);
            deleteCount(str[preI]);
            if(checkCount()) count++;
        }

        System.out.println(count);
    }

    private static void deleteCount(char c) {
        switch(c){
            case 'A':
                myAry[0]--;
                break;
            case 'C':
                myAry[1]--;
                break;
            case 'G':
                myAry[2]--;
                break;
            case 'T':
                myAry[3]--;
                break;
            default:
                break;
        }
    }

    private static boolean checkCount() {
        for (int i = 0; i < 4; i++) {
            if(checkAry[i] > myAry[i])
                return false;
        }
        return true;
    }

    private static void addCount(char c) {
        switch(c){
            case 'A':
                myAry[0]++;
                break;
            case 'C':
                myAry[1]++;
                break;
            case 'G':
                myAry[2]++;
                break;
            case 'T':
                myAry[3]++;
                break;
            default:
                break;
        }
    }
}