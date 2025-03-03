package week5;

import java.util.*;

/*
    문제. 백준 1021번 - 회전하는 큐


    접근방식.
    1. 오른쪾 이동 거리, 왼쪽 이동 거리 모두 해보고 작은 횟수 찾기

 */
public class BJ1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 큐의 크기
        int M = sc.nextInt();   // 뽑아내려고 하는 원소의 개수

        Deque<Integer> deque = new LinkedList<>();

        // 초기 큐 설정
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        int totalMoves = 0; // 연산 횟수 저장


        // 뽑을 숫자 순서 입력받기
        for (int i = 0; i < M; i++) {
            int target = sc.nextInt(); // 현재 뽑아야 하는 숫자
            int index = 0; // 숫자의 현재 위치

            // 큐에서 몇 번째 위치인지 찾기
            for (Integer num : deque) {
                if (num == target) break;
                index++;
            }

            int leftMoves = index;                  // 왼쪽으로 이동 거리 (2번 연산)
            int rightMoves = deque.size() - index;  // 오른쪽으로 이동 거리 (3번 연산)

            // 최소 이동 횟수를 선택
            if (leftMoves <= rightMoves) {
                // 왼쪽으로 이동 (2번 연산)
                for (int j = 0; j < leftMoves; j++) {
                    deque.addLast(deque.pollFirst());
                }
                totalMoves += leftMoves;
            } else {
                // 오른쪽으로 이동 (3번 연산)
                for (int j = 0; j < rightMoves; j++) {
                    deque.addFirst(deque.pollLast());
                }
                totalMoves += rightMoves;
            }

            // 맨 앞의 숫자 제거 (1번 연산)
            deque.pollFirst();
        }

        System.out.println(totalMoves);
        sc.close();
    }



}
