import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class 그룹단어체커{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        // Execute N Times
        for(int i=0;i<n;i++){
            // read i th line
            boolean flag = true;
            String str = br.readLine();
            char[] arr = new char[str.length()];
            if(str.length()==1) {
                count++;
                continue;
            }

            // check per every character
            for(int j=0;j<str.length();j++) {
                if (j==str.length()-1){
                    if(((str.charAt(str.length()-1))==(str.charAt(str.length()-2))))
                        arr[str.length()-1] = str.charAt(str.length()-1);
                }

                else {
                    if (str.charAt(j) != str.charAt(j + 1)) arr[j] = str.charAt(j);
                }
            }

//            if(((str.charAt(str.length()-1))==(str.charAt(str.length()-2)))&&(str.length()!=1))
//                arr[str.length()-1] = str.charAt(str.length()-1);

            // compare the characters in arr
            for(int j=0;j<str.length();j++){
                for(int p=j+1;p<str.length()-j;p++){
                    if(arr[j]==arr[p]){
                        flag = false;
                    }
                }
            }
            if(flag) {
                count++;
                System.out.println(count+": "+ str);
            }
        }
        bw.write("count: "+count+"\n");
        bw.flush();
        bw.close();
    }
}