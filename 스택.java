import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class 스택{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String order = "";
        int size = 0;

        for(int i=0;i<n;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            order = st.nextToken();

            //push
            if(order.equals("push")){
                arr[size] = Integer.parseInt(st.nextToken());
                size++;
            }
            // pop
            else if(order.equals("pop")){
                if(size==0) bw.write("-1\n");
                else{
                    size--;
                    bw.write(arr[size]+"\n");
                }
            }
            // size
            else if(order.equals("size")){
                bw.write(size+"\n");
            }
            // empty
            else if(order.equals("empty")){
                if(size==0) bw.write("1\n");
                else bw.write("0\n");
            }
            // top
            else if(order.equals("top")){
                if(size==0) bw.write("-1\n");
                else bw.write(arr[size-1]+"\n");
            }
            bw.flush();
        }
        bw.close();
    }
}