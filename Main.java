import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double pointSum = 0;
        for(int i=0;i<10;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            // read point and grade
            String grade = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            pointSum += point;

            char gr = grade.charAt(0);
            char ad = grade.charAt(1);
            int grr=1;
            double add = 0.0;

            if(gr == 'A') grr = 4;
            else if(gr == 'B') grr = 3;
            else if(gr == 'C') grr = 2;
            else if(gr == 'D') grr = 1;
            else if(gr == 'F') grr = 0;

            if(grr!=0){
                if(ad == '+') add = 0.5;
            }

            sum += point*(grr + add);
        }
        System.out.println(sum/pointSum);
    }
}