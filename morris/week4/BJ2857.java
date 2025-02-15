import java.util.Scanner;
import java.util.ArrayList;

public class BJ2857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> fbis = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            String target = sc.nextLine();
            if (target.contains("FBI")) {
                fbis.add(i+1);
            }
        }
        
        if (fbis.isEmpty()) {
            System.out.print("HE GOT AWAY!");
        } else {
            for (int count : fbis) {
                System.out.print(count+" ");            
            }
        }

    }
}