import java.util.Scanner;

public class BJ10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int i = 0;
        int j = 0;
        int temp = 0;

        n = scanner.nextInt();

        m = scanner.nextInt();

        int[] bucket = new int[n];

        for (int p = 0; p < n; p++) {
            bucket[p] = p+1;
        }

        for (int p = 0; p < m; p++) {
            i = scanner.nextInt()-1;
            j = scanner.nextInt()-1;
            temp = bucket[i];
            bucket[i] = bucket[j];
            bucket[j] = temp;
        }

        for (int b : bucket) {
            System.out.print(b + " ");
        }
    }
}