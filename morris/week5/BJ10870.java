import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10870 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       favonachi(n, 1);
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    public static int favonachi(int n, int v) {
        int count = 1;
        if (count <= n) favonachi(count+1, v + v);

        return n;
    }
}
