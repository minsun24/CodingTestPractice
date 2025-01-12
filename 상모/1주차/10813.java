package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 바구니에는 1~n번까지 번호가 매겨져 있다. 그리고 공이 1개씩 들어 있다.
        // 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어 있다.
        // 도현이는 앞으로 M번 공을 바꾸려 하는데 공을 바꿀 바구니 2개를 선택, 두 바구니에 들어있는 공을 서로 교환
        // 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하시오.
        Scanner scanner = new Scanner(System.in);
        int n = 0; // 바구니 개수.
        int m = 0; // 공을 교환할 횟수.
        int i = 0;
        int j = 0;
        int temp = 0;
        System.out.println("바구니 개수 입력");
        n = scanner.nextInt();

        System.out.println("교환 횟수 입력");
        m = scanner.nextInt();

        int[] bucket = new int[n];

        for (int p = 0; p < n; p++) {
            bucket[p] = p+1;
        }

        for (int p = 0; p < m; p++) {
            System.out.println("교환 바구니 입력 i");
            i = scanner.nextInt()-1;
            System.out.println("i : "+i);
            System.out.println("교환 바구니 입력 j");
            j = scanner.nextInt()-1;
            System.out.println("i : "+j);
            temp = bucket[i];
            bucket[i] = bucket[j];
            bucket[j] = temp;
            for (int b : bucket) {
                System.out.print(b + " ");
                System.out.println(" ");
            }
        }

        for (int b : bucket) {
            System.out.print(b + " ");
        }
    }
}