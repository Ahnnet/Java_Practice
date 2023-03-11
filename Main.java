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

        String originStr = br.readLine();
        char[] charArr = new char[100];
        charArr = originStr.toCharArray();
        int cursor = originStr.length();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0;i<n;i++){
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            char order = st.nextToken().charAt(0);

            if(order == 'P'){
                char c = st.nextToken().charAt(0);
                charArr[cursor] = c;
                cursor++;
            }

            else if(order == 'L' && cursor != 0){
                cursor--;
            }

            else if(order == 'D' && charArr[cursor]!=0){
                cursor++;
            }

            else if(order == 'B' && cursor != 0){
                int bCursor = cursor;
                while(charArr[bCursor]!=0){
                    charArr[bCursor-1] = charArr[bCursor];
                    bCursor++;
                }
                charArr[bCursor] = 0;
            }
        }

        int i=0;
        while(charArr[i]!=0)
            bw.write(charArr[i]);
        bw.flush();
        bw.close();
    }
}