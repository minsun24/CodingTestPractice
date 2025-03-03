package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
    문제. 백준 3190번 - 뱀
    뱀은 처음에 오른쪽을 향한다.
    게임이 몇 초에 끝나는지 출력

    접근방식.

     NxN 정사각 보드
    뱀 초기 좌표 (0,0)
 */
public class BJ3190 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = br.read();  // 보드의 크기
        int[][] board = new int[N][N];
        int K = br.read();  // 사과의 개수

        // 사과의 위치 설정하기 => 1 로 설정
        for(int i=0;i<K; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            board[row-1][col-1] = 1;
        }

        int L = Integer.parseInt(br.readLine());  // 뱀 방향 변환 횟수

        int countTime = 0;
        int[] position = {0, 0};    // 뱀의 초기 위치

        for(int i=0; i<L; i++){
            String[] input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]);
            char C = input[1].charAt(0);

            countTime += X;
            if(C == 'D'){

            }


        }





        br.close();

    }

}
