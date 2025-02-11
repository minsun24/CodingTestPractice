/*
    1337번 : 올바른 배열
    배열 속에 있는 원소 중 <<5개>>가 연속적인 것
    이 배열이 올바른 배열이 되게 하기 위해서 추가되어야 할 원소의 개수를 출력하는 프로그램

    # 접근
    - 입력받은 값 배열에 넣기
    - sort
    -

 */
package week1;
import java.util.*;

public class BJ1337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){

        }
    }
}
