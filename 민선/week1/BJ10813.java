/*
    10813번 : 공 바꾸기
 */
package week1;
import java.util.*;

public class BJ10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
//        Arrays.setAll(arr, i -> i + 1);  // 배열 초기화 (1부터 N까지) -> 엥 시간이 더 든다.
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        for(int cnt=0; cnt<M; cnt++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }


    }
}
