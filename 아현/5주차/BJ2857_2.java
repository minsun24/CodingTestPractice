package week5;


import java.util.Scanner;

public class BJ2857_2 {
    public static void main(String[] args) {
        /*
        접근방식
        1. 첩보원명을 줄별로 배열에 담음
        2. contains를 활용하여 줄별로 검색
        3. 해당 요원이 몇번째줄에 있는지 출력
        4. 요원이 없는 경우 출력
         */

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        boolean found = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].contains("FBI")){
                if (found) {
                    sb.append(" ");
                }
                sb.append(i + 1);
                found = true;
            }
        }

        if (found) {
            System.out.println(sb);
        } else {
            System.out.println("HE GOT AWAY!");
        }

    }
}
