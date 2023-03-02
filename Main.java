import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char c = 'a';
        char q = 'a'+2;
        if(c == q) bw.write("good\n");
        else bw.write("bad: "+ q+"\n");
        bw.flush();
        bw.close();
    }
}