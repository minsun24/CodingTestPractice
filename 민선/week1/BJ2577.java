/*
    2577번 : 숫자의 개수
    A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지
 */
package week1;
import java.util.*;


public class BJ2577 {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int result = A * B * C ;
        int[] arr = new int[11];
        while(result > 0){
            int num = result % 10 ;
            arr[num+1] ++;
            result /= 10;
        }
        for(int i=1; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
