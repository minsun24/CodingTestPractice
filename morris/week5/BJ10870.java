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

    fibonacci(n);
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    // 1+1=2, 1+2=3, 2+3=5, 3+5=8,
    public static int fibonacci(int n) {
        // System.out.println(v);
        n++;
        // 10까지 반복됨
        if (n < 10) return 1;
        return fibonacci(n);
    }
}
