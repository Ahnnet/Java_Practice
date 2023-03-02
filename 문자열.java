import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 문자열{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String str = br.readLine();
            char a = str.charAt(0);
            char b = str.charAt(str.length()-1);
            bw.write(a+b+"\n");
        }
        bw.flush();
        bw.close();
    }
}