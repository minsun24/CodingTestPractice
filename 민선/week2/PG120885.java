package week2;
/* 프로그래머스 - 이진수 더하기
    케이스 3개에서 런타임 에러가 남.


 */
import java.util.*;

public class PG120885{
    public String solution(String bin1, String bin2) {
        String answer = "";

        String remain; // 남은 문자열 처리
        int len = 0;   // 두 이진수 중 더 짧은 길이

        // 두 문자열 길이를 비교하여 짧은 쪽의 길이를 len에 저장하고, 나머지 부분을 remain에 저장
        if (bin1.length() > bin2.length()) {
            len = bin2.length();
            remain = bin1.substring(0, bin1.length() - bin2.length());
        } else if (bin1.length() < bin2.length()) {
            len = bin1.length();
            remain = bin2.substring(0, bin2.length() - bin1.length());
        } else {
            len = bin1.length();
            remain = "";
        }

        String carry = "0"; // 캐리값 초기화

        // 두 이진수의 동일 길이 부분을 뒤에서부터 한 자리씩 더함
        for (int i = 0; i < len; i++) {
            char one = bin1.charAt(bin1.length() - 1 - i);
            char two = bin2.charAt(bin2.length() - 1 - i);

            if (one == '1' && two == '1') {
                if (carry.equals("0")) {
                    carry = "1";
                    answer = "0" + answer;
                } else {
                    // 캐리 그대로
                    answer = "1" + answer;
                }
            } else if (one == '0' && two == '0') {
                if (carry.equals("1")) {
                    answer = "1" + answer;
                    carry = "0";
                } else {
                    answer = "0" + answer;
                }
            } else { // (one == '1' && two == '0') || (one == '0' && two == '1')
                if (carry.equals("1")) {
                    answer = "0" + answer;
                } else {
                    carry = "0";
                    answer = "1" + answer;
                }
            }
        }

        // remain 처리
        for (int i = remain.length() - 1; i >= 0; i--) {
            char fi = remain.charAt(i);
            if (fi == '1' && carry.equals("1")) {
                carry = "1";
                answer = "0" + answer;
            } else if (fi == '1' && carry.equals("0")) {
                carry = "0";
                answer = "1" + answer;
            } else if (fi == '0' && carry.equals("1")) {
                carry = "0";
                answer = "1" + answer;
            } else {
                answer = "0" + answer;
            }
        }

        // 최종 캐리가 남아있다면 추가
        if (carry.equals("1")) {
            answer = carry + answer;
        }

        return answer;
    }
}