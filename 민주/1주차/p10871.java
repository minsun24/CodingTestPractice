import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10871 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        String[] str = br.readLine().split(" ");

        for(int i = 0; i < n; i++){
            if(Integer.parseInt(str[i]) < x){
                bw.write(str[i]+" ");
            }
        }

        bw.flush();
        bw.close();
    }
}
