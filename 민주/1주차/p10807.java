import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10807 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < n; i++ ){
            nums[i] = Integer.parseInt(str[i]);
        }

         //옮겼으니까
         //v가 몇개인지 알고 싶어

         //1.v를 입력하고
        int v = Integer.parseInt(br.readLine());


         // 2.기차 칸이랑 비교해야겠지 몇개인지 같은지 다른지 (같을 때 카운트해야겠다)
        int result = 0;
        for (int i = 0; i < n; i++){
            if(nums[i] == v)
                result++;
        }

        bw.write(result+"");
        bw.flush();
        bw.close();

    }
}