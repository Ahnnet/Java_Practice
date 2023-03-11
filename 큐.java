import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class 큐{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        String str;
        StringTokenizer st;
        String order;
        int last = 0; // 가장 최근에 push 한 정수를 저장하는 변수!!! Back 을 출력할 때 사용 한다.
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            order = st.nextToken();

            if(order.equals("push")){
                last = Integer.parseInt(st.nextToken());
                queue.add(last);
            }

            else if(order.equals("pop")){
                if(queue.isEmpty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(queue.poll()+"\n");
                }
            }

            else if(order.equals("size")){
                bw.write(queue.size()+"\n");
            }

            else if(order.equals("empty")){
                if(queue.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }

            else if(order.equals("front")){
                if(queue.isEmpty()) bw.write("-1\n");
                else bw.write(queue.peek()+"\n");
            }

            else if(order.equals("back")){
                if(queue.isEmpty()) bw.write("-1\n");
                else {
                    bw.write(last+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}