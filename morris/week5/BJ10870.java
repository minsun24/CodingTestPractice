import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ10870 {
    public static void main(String[] args) throws IOException {
    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    int n = Integer.parseInt(br.readLine());
    // Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();

    int result = fibonacci(10);
    System.out.println(result);
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    // 1+1=2, 1+2=3, 2+3=5, 3+5=8,
    // 재귀함수를 이용하여 n번째 피보나치 수를 계산하는 함수 (F(0)=0, F(1)=1)
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
