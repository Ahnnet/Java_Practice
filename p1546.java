import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class p1546{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        str = br.readLine();
        st = new StringTokenizer(str, " ");

        double[] arr = new double[n];
        double max = 0.0;
        for(int i=0;i<n;i++){
            arr[i] = Double.parseDouble(st.nextToken());
            if(arr[i]>max) max = arr[i];
        }

        double sum = 0.0;
        for(int i=0;i<n;i++){
            sum = sum + (arr[i]*100/max);
        }
        System.out.println(sum/n);
        bw.flush();
        bw.close();
    }
}