package week7;
import java.util.Arrays;
import java.util.Scanner;

/*
    문제. 백준 11399번 - ATM
    접근방식.
        - Arrays.sort() 후 이중 for문
 */


public class BJ11399 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 줄 서있는 사람들

        int[] lines = new int[N];

        for (int i = 0; i < N; i++) {
            lines[i] = sc.nextInt();
        }
        Arrays.sort(lines);

        int time= 0;
        for (int i=0; i<N; i++) {
            for(int j=0; j<=i; j++){
                time += lines[j];
            }
        }
        System.out.println(time);

    }
}
