import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class 에디터{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String originStr = br.readLine();
        char[] arr = originStr.toCharArray();
        char[] charArr = new char[100];
        System.arraycopy(arr, 0, charArr, 0, originStr.length());

        int cursor = originStr.length();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0;i<n;i++){
            System.out.print("now: ");
            for(int k=0;k<10;k++){
                System.out.print(charArr[k]+" ");
            }
            System.out.println("\nCursor: "+cursor+"\n");

            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            char order = st.nextToken().charAt(0);

            if(order == 'P'){
                if(charArr[cursor]!=0){
                    int count  = arrCount(charArr,cursor);
                    System.arraycopy(charArr,cursor,charArr,cursor+1,count);
                }
                char c = st.nextToken().charAt(0);
                charArr[cursor] = c;
                cursor++;
            }

            else if(order == 'L' && cursor != 0){
                cursor--;
            }

            else if(order == 'D' && charArr[cursor]!=0){
                cursor++;
            }

            else if(order == 'B' && cursor != 0){
                int count = arrCount(charArr, cursor);

//                System.arraycopy(charArr, cursor-1, charArr, cursor, count);
//                cursor--;
//                charArr[cursor+count]=0;
                cursor--;
                for(int j=1;j<=count;j++){
                    charArr[cursor] = charArr[cursor+j];
                }
                charArr[cursor+count]=0;
            }
        }

        int i=0;
        while(charArr[i]!=0) {
            bw.write(charArr[i]);
            i++;
        }
        bw.flush();
        bw.close();
    }

    static int arrCount(char[] arr, int cursor){
        int count = 0;
        while(arr[cursor+count]!=0) count++;
        System.out.println("Count: "+count);
        return count;
    }
}