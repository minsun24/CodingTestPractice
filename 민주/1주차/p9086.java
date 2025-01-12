import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p9086 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ts = Integer.parseInt(br.readLine());

        //for(초기식1; 조건식2; 증감식4){
        //          실행되는 코드3
        //}
        //다른 코드3
        for(int i = 0; i < ts; i++){
            String[] str = br.readLine().split("");
            bw.write(str[0]+str[str.length-1]+"\n");
        }

        bw.flush();
        bw.close();

    }
}
