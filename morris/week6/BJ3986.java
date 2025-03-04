import java.util.Scanner;
import java.util.Random;

public class BJ3986{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 2; j < Math.random()+10; j++) {
                
            }
        }
        System.out.println("Hello World!");
        
    }
}

// 각 A, B가 홀수인 경우 나쁜 수다.
// BABA, BAB, ABA, BBAABBABA 등이 나쁜 수다.
// A 또는 B 사이에 서로 배타적인 알파벳이 끼여 있는 경우. 나쁜 수다.

// 좋은 수 찾기
// 각 A, B가 페어인지
// A, B가 서로 교차되어 있는지
// ABA BB ABA
// AABB
// ABBA

// BABBA = 
// AAA
// AA
// AB

// ABBABB