import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 문자열의합{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        String str = br.readLine();
        for(int i=0;i<n;i++){
            sum += (int)(str.charAt(i)-'0');
            // sum += Character.getNumericValue(str.charAt(i));
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}