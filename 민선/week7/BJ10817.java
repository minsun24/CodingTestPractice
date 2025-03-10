package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*  문제. 백준 10817번 - 세 수
    접근방식.
    - 배열에 넣고 Arrays.sort()
    - Math가 더 효율적이라고 함. 시간복잡도 O(1)

*    */
public class BJ10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        System.out.println(mid);

//        int[] arr = new int[3];
//        for (int i = 0; i < 3; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//
//        System.out.println(arr[1]);


    }
}
