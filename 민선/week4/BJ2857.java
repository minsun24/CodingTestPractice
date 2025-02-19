package week4;

/*  4주차 공통 문제. 백준 2587번 - FBI

    접근방식.
    - 문자열 입력 받고
    - split() 으로 분리
    - 각 단어에 FBI 포함되어 있는지 String.contains() 로 판별

    check.
    - 대시(-) 조건이 포함되어 있어 무의식적으로 split() 을 사용하였는데, 필요 없는 부분이었다.
    - 문제를 충분히 이해하지 않고, 바로 코드부터 작성해서 그런 듯.
        (문제를 제대로 이해하고 의사코드를 먼저 작성하는 습관을 들여야겠다.)
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ2857{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<5; i++){
            String name = sc.nextLine();

            if(name.contains("FBI")){
                answer.add(i+1);
            }
        }

        if(answer.isEmpty()){
            System.out.println("HE GOT AWAY!");
        }else{
            for(int num: answer){
                System.out.print(num + " ");
            }
        }
    }




}
