import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 아스키코드{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = br.readLine().charAt(0);
        System.out.println(c);
    }
}