/* 1259번 : 팰린드롬인지 확인하기
    # 접근 : 문자열로 입력 받아서 팰린드롬인지 확인하기
        팰린드롬 확인 메서드 - 문자열 양쪽(앞/뒤)로 확인
    #
    # 시간복잡도 : O(N * M)
      각 문자열 길이(N),  입력받는 문자열의 개수(M)
 */


package week1;
import java.util.*;


public class BJ1259{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if (str.equals("0")) {
                break;  // 0을 입력받으면 종료
            }

            // 입력값 출력

            // 팰린드롬 여부 판단
            if (isPalindrome(str)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }

    // 팰린드롬인지 확인하는 메서드
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // 다르면 팰린드롬 아님
            }
            left++;
            right--;
        }
        return true;
    }
}
