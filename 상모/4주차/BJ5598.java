import java.util.Scanner;

public class BJ5598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        String alpha = sc.nextLine(); //FURDWLD
        
        for (char ch : alpha.toCharArray()) {
            int ascii = (int)ch-3;
            if (ascii < 'A') {
                ascii += 26;
            }
            answer.append((char)ascii);
        }
        System.out.println(answer.toString());
    }
}