package week7;

import java.util.*;

/*  문제. 백준 1026번 - 보물
        - S = A[0] × B[0] + ... + A[N-1] × B[N-1]
        - s값을 최소로 만들기 위해 A를 재배열
*       - B배열을 재배열하면 안된다

    접근방식.
        - S값이 최소가 되려면, (작은수*가장큰수)로 계산되어야 함.
        - A열은 오름차순 정렬
        - B열에서 최댓값 뽑아가며, A열 작은 수 * B열 최댓값 곱하기
     think.
        - B열 재정렬은 하지 않았는데, 문제가 요구하는 것이 무엇인지 모르겠음.
     learned.
        - List 최대, 최수 => Collections 사용
         : Collections.max(list), Collections.min(list)
        - List 인덱스로 원소 제거 : list.remove(index)
        - LIst 원소값을 제거할 때 : List.remove(Integer.valueOf(원소값)) => Integer 리스트일 때

* */
public class BJ1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
//        int[] B = new int[N];
        List<Integer> B = new ArrayList<Integer>();

        // A, B 배열 입력받기
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            B.add(sc.nextInt());
//            B[i] = sc.nextInt();
        }
        // A 배열 오름차순으로 정렬
        Arrays.sort(A);

        int S = 0; // 구하려는 수(최솟값)
        int b_max;
        for(int i=0; i<A.length; i++){
            b_max = Collections.max(B);
            S += A[i] * b_max;
            B.remove(Integer.valueOf(b_max));
        }

        System.out.println(S);

    }
}
