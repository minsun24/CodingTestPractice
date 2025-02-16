import java.util.Scanner;
import java.util.Stack;

public class BJ10773 {
    public static void main(String[] args) {
        /* 설명. 문제. 백준 10773번
        *   돈을 부를때마다 모든 수를 받아 적은 후 그 수의 합을 구하는 문제
        *   단, 돈을 잘못 부를 경우 0을 외치는데, 이는 가장 최근에 쓴 수를 지운다.
        *    조건 : 첫번째 줄에 정수 K가 주어지고 이후 K개의 줄에 정수가 1개씩 주어진다.
        *    출력 : 최정적으로 적어 낸 수 의 합을 출력한다.
        * */

        /* 설명. 처음에 k로 입력 횟수를 설정하고 while문으로 k일때까지 반복
        *   그 후 스택을 만들어 값을 차곡차곡 넣는데, 만약 0이 입력 될 경우
        *   pop을 사용해 제거한다. */

        Stack<Integer> stack = new Stack();      // 스택 생성

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();                    // 횟수 지정

        for(int i  = 0; i < k; i++) {            // 입력 횟수까지 반복
            int number = sc.nextInt();

            if(number == 0){
                stack.pop();
            }
            else{
                stack.push(number);
            }
        }

        int sum = 0;

        for(int o : stack){
            sum += o;
        }

        System.out.println(sum);
    }
}
