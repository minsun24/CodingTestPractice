package week4;

/* 문제. 프로그래머스(입문) - 종이 자르기 */
/* 접근 방식 1. 해결
    규칙 찾기  (M - 1) + M * (N - 1)
    가로 M , 세로 N

    가로 M 을 1로 자르는 횟수는 (M-1)번
    가로 자르고 나면, 종이 갯수가 M개로 늘어남

    그 M장의 종이를 각각 세로를 1로 만드는 개수(N-1)로 자르면 됨.
    식 => (M - 1) + M * (N - 1) == M*N - 1 과 같음.

 */


public class PG120922 {
    public static void main(String[] args) {
        int M = 3;
        int N = 3;
        int answer = 0;

        answer = (M - 1) + M * (N - 1) ;
        // M*N - 1 과 같음.

        // answer = M*N-1;
        // 종이를 한번 자를때마다 한조각씩 늘어남 -> 10조각 만들려면 9번 잘라야해요. 토너먼트랑 비슷한 개념이에요. (???)
//        return answer;
        System.out.println(answer);
    }
}
