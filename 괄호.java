import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;
public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        loop:
        for(int i=0;i<n;i++){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);

                if(c=='(') stack.push(c);
                else if(stack.empty()) {
                    bw.write("NO\n");
                    continue loop;
                }
                else stack.pop();
            }
            if(stack.empty()) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.flush();
        bw.close();
    }
}
