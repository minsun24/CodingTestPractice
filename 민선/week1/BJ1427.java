/*
    1427번 : 소트인사이드
    # 숫자 내림차순 정렬
    # 접근 : 숫자를 문자열로 입력받고, char 타입 배열로 변환

    // Arrays.sort(arr, Collections.reverseOrder())
    // - Int[] 가 아니라, Integer[] 배열이어야 한다.

    # 시간복잡도 : O(N log N)
        배열 생성-O(N), Array.sort()-O(NlogN), 역순 출력-O(N)
 */
import java.util.*;

public class BJ1427 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[arr.length - 1-i]);
        }
    }
}
