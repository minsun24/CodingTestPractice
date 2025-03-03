package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    문제. 백준 11004번 - K번째 수
    접근방식.
    배열을 정렬하는 대신 K개의 원소만 유지하는 PriorityQueue를 사용
    최대힙(부모 노드 값이 항상 자식 노드보다 크거나 같은 이진 트리)

    A1, A2, ..., AN의 수가 주어지고
    이중에서 앞에서부터 K번째 있는 수를 구하려고 할 때,
    원소들을 순서대로 maxHeap에 넣고, 크기가 K를 넘을 경우, 첫번째 값(가장 큰 값)을 제거하도록 하면
    결과적으로 마지막에는 K번째의 수만 남게 된다.


 */
public class BJ11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 배열 크기
        int K = Integer.parseInt(st.nextToken());   // K번째 작은 수 찾기

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            pq.add(Integer.parseInt(st.nextToken()));
            if(pq.size() > K){
                pq.poll();
            }

        }
        System.out.println(pq.poll());


    }
}
