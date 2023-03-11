import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class 에디터_스택이용정답{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> lStack = new Stack<Character>();
        Stack<Character> rStack = new Stack<Character>();

        String originStr = br.readLine();

        for(int i=0;i<originStr.length();i++){
            lStack.push(originStr.charAt(i));
        }

        String str;
        StringTokenizer st;
        String order;

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            str = br.readLine();
            st=  new StringTokenizer(str, " ");
            order = st.nextToken();

            if(order.equals("P")){
                char c = st.nextToken().charAt(0);
                lStack.push(c);
            }
            else if(order.equals("L") && !lStack.isEmpty()){
                char c = lStack.pop();
                rStack.push(c);
            }
            else if(order.equals("D") && !rStack.isEmpty()){
                char c = rStack.pop();
                lStack.push(c);
            }
            else if(order.equals("B")&& !lStack.isEmpty()){
                lStack.pop();
            }
        }
        while(!lStack.isEmpty()){
            char c = lStack.pop();
            rStack.push(c);
        }
        while(!rStack.isEmpty()){
            bw.write(rStack.pop());
        }
        bw.flush();
        bw.close();
    }
}