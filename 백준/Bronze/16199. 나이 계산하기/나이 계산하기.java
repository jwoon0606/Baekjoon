import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LocalDate birthDt = LocalDate.of(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        LocalDate newDt = LocalDate.of(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));

        System.out.println(Period.between(birthDt,newDt).getYears());
        LocalDate birthFirstDayOfYear = LocalDate.of(birthDt.getYear(),1,1);
        System.out.println(Period.between(birthFirstDayOfYear,newDt).getYears() + 1);
        System.out.println(Period.between(birthFirstDayOfYear,newDt).getYears());
    }
}