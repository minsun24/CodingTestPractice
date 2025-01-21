/*
    1541번 : 잃어버린 괄호
    괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램
    +, - 연산자만 사용

    # 접근
        - 뺄셈(-) 연산자 기준으로 분리 -> + 끼리 묶음이 됨
        - 묶음에서 (+) 연산지 기준으로 분리해서 -> 연산
        - 첫번째 그룹(- 연산자 나오기 전 맨 처음 식) 에서 나머지 그룹 연산 결과(+) 빼기
    # 에러
       - parse int 주의

    # 시간 복잡도 : O(N)
 */
package week1;

import java.util.*;

public class BJ1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split("-");  // - 기준으로 분리
        int result = 0;

        // 첫 번째 그룹은 무조건 더함
        String[] firstGroup = arr[0].split("\\+");
        for (String num : firstGroup) {
            result += Integer.parseInt(num);
        }

        // 두 번째 그룹부터는 모두 빼기
        for (int i = 1; i < arr.length; i++) {
            String[] sub_arr = arr[i].split("\\+");
            int sum = 0;

            for (String num : sub_arr) {
                sum += Integer.parseInt(num);
            }

            result -= sum;  // 뺄셈 처리
        }

        System.out.println(result);
    }
}