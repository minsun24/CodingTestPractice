package week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/*
    문제.  백준 26042번 - 식당 입구 대기 줄

    식당 입구에 줄을 서서 대기하는 학생 수가 최대가 되었던 순간의 학생 수
    이때 식당 입구의 맨 뒤에 대기 중인 학생의 번호

 */
public class BJ26042 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxLength = 0;
        int lastStudent = Integer.MAX_VALUE; // 초기값을 최대값으로 설정


        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int studentNumber = sc.nextInt();
                queue.add(studentNumber);

                if (queue.size() > maxLength) {
                    maxLength = queue.size();
                    lastStudent = studentNumber;
                } else if (queue.size() == maxLength) {
                    lastStudent = Math.min(lastStudent, studentNumber);
                }
            } else {        // type 2 일 경우
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
        }

        System.out.println(maxLength + " " + lastStudent);
        sc.close();
    }
}
