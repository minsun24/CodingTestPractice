package week7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/*  문제. 백준 2217번 - 로프
*   접근방식.
*       - 가장 무거운 무게를 감당하는 로프가 포함되어야 함.
*       - 무거운 것부터 ... n 개 
*       - 오름차순/내림차순 정렬 후 큰 것부터, 1, 2, 3, ...N개씩 계산해가며 최댓값 구하기
*
*  */
public class BJ2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 로프의 개수

        Integer[] ropes = new Integer[N];

        for(int i=0; i<N; i++){
            ropes[i] = sc.nextInt();
        }
//        Arrays.sort(ropes);     // 로프 오름차순 정렬
        Arrays.sort(ropes, Collections.reverseOrder());
        int max = 0;
        for(int i=0; i<N; i++){
            int now_max = 0;
            for(int j=0; j<=i; j++){
                now_max += ropes[j];
            }
            if(now_max < max){

            }
            int divided = max/(i+1) + max%(i+1);
            System.out.println(divided);
            for(int j=0; j<=i; j++){
                if(ropes[i-j] < divided){
                    System.out.println("최댓값은" + ropes[i-j]);
                }
            }
        }
        

    }
}
