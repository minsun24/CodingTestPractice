import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ10870 {
    public static void main(String[] args) throws IOException {
    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    int n = Integer.parseInt(br.readLine());
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    fibonacci(n, 1);
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    public static void fibonacci(int n, int v) {
        // System.out.println(v);
        n++;
        System.out.println(n);
        // 10까지 반복됨
        if (n < 10) fibonacci(n++, v + v);
    }
}
