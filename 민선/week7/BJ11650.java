package week7;

import java.util.*;

/*
    문제. 백준 11650번 - 좌표 정렬하기
    접근방식.


 */
public class BJ11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<int[]> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new int[]{x, y});
        }
//        for (int[] value : list) {
//            System.out.println(Arrays.toString(value));
//        }

        // 정렬하기
        list.sort((o1, o2) -> {
            if(o1[0] == o2[0]) {         // x 좌표값 같으면
                return o1[1] - o2[1];    // y 기준 오름차순
            }
            return o1[0] - o2[0];        // x 기분 오름차순
        });
        for (int[] value : list) {
            System.out.println(value[0] + " " + value[1]);
        }



    }
}
