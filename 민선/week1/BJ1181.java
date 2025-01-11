/* bj 1181번 : 단어 정렬

    - 중복 제거 -> Set중, 자동 정렬이 되는 TreeSet 이용
    - 사용자 임의 정렬 기준 Collections.sort((List, (비교1, 비교2) -> {비교식});   // 람다식
    - Collections.sort() 는 List만 가능
    - set 으로 입력 받고, List로 변환해서 다시 정렬

 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();  // 개행 문자 제거

        Set<String> set = new TreeSet<>();  // 자동 정렬 + 중복 제거

        for(int i=0; i<N; i++){
            set.add(sc.nextLine());
        }

        // Set → List 변환
        List<String> arr = new ArrayList<>(set);

        Collections.sort(arr,(String s1, String s2) -> {
           if(s1.length() == s2.length()){
               return s1.compareTo(s2);  // 길이가 같으면 사전 순
           }else{
               return s1.length() - s2.length();  // 길이 순
           }
        });
        for(String str : arr){
            System.out.println(str);
        }

    }
}