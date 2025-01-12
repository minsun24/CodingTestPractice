/*
    10809번 : 알파벳 찾기
    # 접근
        - 아스키 코드 a(97) ~
        - a ~ z 알파벳 개수 크기의 배열 생성 및 -1로 초기화
        - 문자열 한 문자씩 탐색하며 해당 문자를 알파벳 배열의 인덱스로, 값은 문자열의 인덱스로

    # 시간 복잡도 : O(N)
        배열 초기화: O(1)
        문자열 탐색: O(N)
        배열 출력: O(1)
 */
import java.util.*;

public class BJ10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int[] array = new int[('z'-'a') + 1];    //26
        Arrays.fill(array, -1);     // 배열 전체를 -1로 초기화

        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(array[c-97] == -1) {
                array[c - 97] = i;
            }
        }
        for(int i=0; i<array.length; i++){
            if(i == array.length -1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + " ");
            }

        }

    }
}
