import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        HashMap<String,Double> map = new HashMap<String, Double>();
        map.put("A+",4.5);map.put("A0",4.0);map.put("B+",3.5);map.put("B0",3.0);map.put("C+",2.5);map.put("C0",2.0);map.put("D+",1.5);map.put("D0",1.0);map.put("F",0.0);
        double count = 0;
        double sum = 0;
        for(int i=0; i<20; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(!grade.equals("P")){
                count+= credit;
                sum += credit * map.get(grade);
            }
        }
        double result = sum / count;
        System.out.println(result);
    }
}