package week2;
/* 문제. BOJ 3273번. 두 수의 합 */
/* 알고리즘분류. 정렬 & 두 포인터 */
/* 접근방식.
*   1. 이중 for 문 -> 에러. 시간 초과
*   2. 알고리즘 분류 컨닝 후 : 두 포인터로 풀이 -> 해결.
* */



import java.util.*;

public class BJ3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 수열 크기(개수)
        int[] arr = new int[n];

        // 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();  // 목표 합

        // 정렬 후 투 포인터 사용
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int cnt = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
                cnt++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(cnt);
    }
}
