package week6;

import java.util.HashMap;
import java.util.Scanner;

/*
    문제. 백준 1920번 - 수 찾기
    N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램

    접근방식.

 */
public class BJ1920 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> first = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            first.put(sc.nextInt(), 0);
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int target = sc.nextInt();
            if(first.containsKey(target)) {
//                first.put(target, 1);
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
