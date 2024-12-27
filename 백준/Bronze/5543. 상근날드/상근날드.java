import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min_burger = Integer.parseInt(br.readLine());
        for(int i=0; i<2; i++) {
            int a = Integer.parseInt(br.readLine());
            if(min_burger > a) min_burger = a;
        }

        int min_tansan = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        if(min_tansan > a) min_tansan = a;

        System.out.println(min_burger + min_tansan - 50);
    }
}