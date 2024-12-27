import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Character[] vowel = {'a', 'e', 'i', 'o', 'u'};
        List<Character> vowelList = new ArrayList<>(Arrays.asList(vowel));

        StringBuilder sb = new StringBuilder();
        while(true) {
            String str = br.readLine();
            if(str.equals("#")) break;
            str = str.toLowerCase();
            int count = 0;
            for(int i=0; i<str.length(); i++) {
                Character c = str.charAt(i);
                if(vowelList.contains(c)) count++;

            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}