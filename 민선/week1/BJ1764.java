/*
    1764번 : 듣보잡
    - 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M
    - 듣도,보도 못한 사람에 모두 해당하는 사람 수, 이름 출력
    # 접근
        동적 배열
        contains(arr.get(i)) => 시간 초과
    # 문제 - 시간 초과 문제
      해결 - <HashSet>으로 해결 - 검색 속도가 O(1)으로, ArrayList(O(N)) 보다 빠름
            HashSet에 듣도 못한 사람 저장하고, 보도 못한 사람을 입력 받으면서 동시에 contains로 비교
            (보도 못한 사람은 따로 저장하지 않음)
 */
package week1;
import java.util.*;

public class BJ1764 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        ArrayList<String> heard = new ArrayList<>();    // 듣도 못한 사람
        HashSet<String> heard = new HashSet<>();   // hashset 이용해 빠른 검색 가능
        ArrayList<String> result = new ArrayList<>();     // 듣도, 보도 못한 사람

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();  // 입력 버퍼 비우기
        
        // 듣도 못한 사람 입력
        for(int i=0; i<N; i++){
            heard.add(sc.nextLine());
        }
        // 보도 못한 사람 입력 및 중복 확인
        for(int i=0; i<M; i++){
            String name = sc.nextLine();

            if(heard.contains(name)){
                result.add(name); 
            }
        }
        // 사전순 정렬
        Collections.sort(result); // ArrayList 는 collections로 정렬 필요
        // 듣보잡 수 출력
        System.out.println(result.size());
        // 듣보잡 명단 출력
        for(String s : result){
            System.out.println(s);
        }
    }
}
