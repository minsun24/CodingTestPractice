import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 5줄 순회
        for(int i = 1; i <= 5; i++) {
            String str = br.readLine();

            if(str.contains("FBI")) sb.append(i).append(" ");
        }

        System.out.println(sb.length() == 0 ? "HE GOT AWAY!" : sb);
    }
}
