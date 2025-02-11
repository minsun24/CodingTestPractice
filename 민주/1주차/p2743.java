import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2743 {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       String Str= br.readLine();
       bw.write(Str.length()+"");
       //length() 뒤에 +""을 붙여주면 String으로 인식된다.

       bw.flush();
       bw.close();
    }
}
