package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
    백준 10866번 - 덱 
    덱 기본 활용 문제
    
    접근방식 1. split(" ") 으로 명령어 자르기 , soutv 로 케이스마다 출력
            2. startwWith("") , substring(idx) 사용 & StringBuilder 사용해 한번에 출력
               split()은 정규식을 사용하기 때문에 성능이 상대적으로 느려서, substring()사용하는 것이 더 효율적이라고 함.
            1 번(280ms) => 2번 (148ms)
    
 */

public class BJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String command = br.readLine();

            if (command.startsWith("push_front")) {
                deque.addFirst(Integer.parseInt(command.substring(11)));
            } else if (command.startsWith("push_back")) {
                deque.addLast(Integer.parseInt(command.substring(10)));
            } else {
                switch (command) {
                    case "pop_front":
                        sb.append(deque.isEmpty() ? -1 : deque.removeFirst()).append('\n');
                        break;
                    case "pop_back":
                        sb.append(deque.isEmpty() ? -1 : deque.removeLast()).append('\n');
                        break;
                    case "size":
                        sb.append(deque.size()).append('\n');
                        break;
                    case "empty":
                        sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                        break;
                    case "front":
                        sb.append(deque.isEmpty() ? -1 : deque.getFirst()).append('\n');
                        break;
                    case "back":
                        sb.append(deque.isEmpty() ? -1 : deque.getLast()).append('\n');
                        break;
                }
            }
        }
        br.close();
        System.out.print(sb);
    }
}
