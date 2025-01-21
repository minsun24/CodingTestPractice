package week2;
/* 문제. 프로그래머스 - 이진수 더하기 */
/* 접근방식.  바이너리 변환 함수 사용
*   Integer.parseInt(정수, radix) : radix진수로 인식해서 16진수 정수로 변환해줌.
*   Integer.toBinaryString(int) : int정수를 이진수 문자열로 변환해줌.
* */

public class PG120885FUNCTION {
    public static void main(String[] args) {
        //ex.
//        String bin1 = "10";
//        String bin2 = "11";
//        String result = solution(bin1, bin2);
//        System.out.println(result);
    }
    public static String solution(String bin1, String bin2) {
        String answer = "";
        // 이진수를 16진수 정수로 변환
        int one = Integer.parseInt(bin1, 2);
        int two = Integer.parseInt(bin2, 2);
        
        int result = one + two;  // 정수 연산
        answer = Integer.toBinaryString(result);    // 16진수->2진수로 변환
        return answer;
    }
}
