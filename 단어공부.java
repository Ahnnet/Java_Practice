import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 단어공부{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            for(int j=0;j<26;j++){
                if(c=='A'+j || c=='a'+j){
                    arr[j]++;
                }
            }
        }

        int max = -1;
        int maxPosition = -1;
        boolean flag = true;
        for(int i=0;i<26;i++){
            if(arr[i]>max){
                max = arr[i];
                maxPosition = i;
                flag = true;
            }
            else if(arr[i] == max){
                flag = false;
            }
        }
        if(flag) bw.write((char)('A'+maxPosition)+"\n");
        else System.out.println("?");

        bw.flush();
        bw.close();
    }
}