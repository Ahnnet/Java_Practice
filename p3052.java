import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class p3052 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = (Integer.parseInt(br.readLine())%42);
        }

        int count = 0;
        for(int i=0;i<10;i++){
            int tmp = 0;
            for(int j=i+1;j<10;j++){
                if(arr[i]==arr[j]) {tmp++;}
            }
            if(tmp==0) {count++;}
        }
        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}
