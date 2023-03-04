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

        for(int i=0;i<n;i++){


            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            float sum = 0;
            for(int j=0;j<N;j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            float avg = sum / N;
            float count = 0;
            for (int j=0;j<N;j++){
                if(arr[j]>avg) count++;
            }
            float result = count / N * 100;
            System.out.printf("%.3f",result);
            System.out.println("%\n");

        }


    }
}