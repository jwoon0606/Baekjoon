import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] finger = {1,2,3,4,5,4,3,2};

        System.out.println(finger[(N-1)%8]);
    }
}