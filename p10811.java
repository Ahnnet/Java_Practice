import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class p10811{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        StringTokenizer st;

        str = br.readLine();
        st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(n);
        System.out.println(m);

        // initialize
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        System.out.println("good");
        // repeat M times
        for(int i=0;i<m;i++){
            System.out.println("in");
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;

            int temp;
            for(int j=0;j<(end-start+1)/2;j++){
                temp = arr[start+j];
                arr[start+j] = arr[end-j];
                arr[end-j] = temp;
            }
        }

        // print
        for(int i=0;i<n;i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}