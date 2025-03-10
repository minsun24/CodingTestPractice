package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {
    public static void main(String[] args) throws IOException {
        /* 문제
         * 첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
         * 이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며,
         * 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
         * 정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
         */

        /* 접근방식
         * 1. 정수 입력받음.
         * 2. 반복문 -> if 정수가 0일 경우 가장 최근 수 삭제, 아닌 경우 해당 정수 push
         * 3. 최종 남은 수 합산
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 선언
        Stack<Integer> stackInt = new Stack<>();

        int K = Integer.parseInt(br.readLine());      // 입력 개수

        // 입력처리

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());      // 입력받은 정수

            if (num == 0) {
                if (!stackInt.isEmpty()) {
                    stackInt.pop();
                }
            } else {
                stackInt.push(num);
            }
        }
        // 스택에 남아 있는 수 합산
        int sum = 0;
        for (Integer number : stackInt) {
            sum += number;
        }

        // 결과 출력
        System.out.println(sum);
    }
}
