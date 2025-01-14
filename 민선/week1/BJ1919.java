/*  1919 번 : 애너그램 만들기
    # 접근
    두 문자열(A, B)이 가진 알파벳 개수가 같으면 애너그램 가능
    알파벳 개수를 담는 배열 2개 생성
    각 문자열을 받아서 -> 한 문자씩 탐색 -> 개수 세기
    알파벳 개수 배열 탐색해가며 같은 개수인지 확인
    같은 개수가 아니라면 -> |A-B| 개를 제거해야 한다.

*/
import java.util.*;

public class BJ1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자열 입력받기
        String first = sc.nextLine();
        String second = sc.nextLine();

        int[] a = new int['z' - 'a' + 1];  // first 문자열의 알파벳 개수를 담을 배열
        int[] b = new int['z' - 'a' + 1];  // second 문자열의 알파벳 개수를 담을 배열

        // first 문자열 알파벳 개수 세기
        for(int i=0; i<first.length(); i++){
            char a_c = first.charAt(i);
            a[a_c - 'a'] ++;
        }
        // second 문자열 알파벳 개수 세기
        for(int i=0; i<second.length(); i++){
            char b_c = second.charAt(i);
            b[b_c - 'a'] ++;
        }
        int cnt = 0;  // 제거해야 할 문자 개수

        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                int sum = (a[i] - b[i]);
                // 절댓값으로 개수 더하기
                if(sum < 0){
                    sum *= -1;
                }
                cnt += sum;
            }
        }
        System.out.println(cnt);

    }
}