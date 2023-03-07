import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<n;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            while(st.hasMoreTokens()){
                String line = st.nextToken();
                char[] charArr = new char[line.length()];
                for(int j=0;j<line.length();j++) charArr[j] = line.charAt(j);

                char temp;
                for(int j=0;j<line.length()/2;j++){
                    temp = charArr[j];
                    charArr[j] = charArr[line.length()-1-j];
                    charArr[line.length()-1-j] = temp;
                    line = new String(charArr);
                }
                bw.write(line+" ");
            }
            bw.write("\n");
            bw.flush();
        }
        bw.close();
    }
}