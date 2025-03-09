import java.util.*;

public class BJ2693 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int i = 0; i < T; i++) {
            Integer[] numbers = new Integer[10];

            for (int j = 0; j < 10; j++) {
                numbers[j] = scanner.nextInt();
            }

            Arrays.sort(numbers, Collections.reverseOrder());
            System.out.println(numbers[2]);
        }

        scanner.close();
    }
}