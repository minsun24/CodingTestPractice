import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();


        int[] a = new int[n];
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] < x) {
                answer.add(a[i]);
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
