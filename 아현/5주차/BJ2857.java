package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2857 {
    public static void main(String[] args) throws IOException {
        /*
        접근방식
        1. 첩보원명을 줄별로 배열에 담음
        2. contains를 활용하여 줄별로 검색
        3. 해당 요원이 몇번째줄에 있는지 출력
        4. 요원이 없는 경우 출력
         */

        /* StringBuilder
        * 기존 객체 수정이 가능하며(가변) 메모리 사용량이 적음.
        * 버퍼에서 직접 수정하기 때문에 속도가 빠르며 멀티스레드 환경에선 안전하지 않으나
        * 문자열을 자주 변경해야 하는 경우 사용함
        * */

        /* BufferReader를 사용할 때는 반드시 예외처리 필요
         * 왜? 입출력(IO)작업은 항상 오류(예외)가 발생할 가능성이 있기 때문
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=5;i++) {
            if(br.readLine().contains("FBI"))
                sb.append(i).append(" ");
        }
        if(sb.isEmpty()) System.out.println("HE GOT AWAY!");
        else System.out.println(sb);



    }
}
