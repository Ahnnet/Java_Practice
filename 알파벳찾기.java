import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 알파벳찾기{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int[] arr = new int[26];
        for(int i=0;i<26;i++){
            arr[i] = -1;
        }

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            for(int j=0;j<26;j++){
                if((c == ('a'+j))&&(arr[j]==-1)) arr[j] = i;
            }
        }

        for(int i=0;i<26;i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}