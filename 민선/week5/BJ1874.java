package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
    문제. 백준 1874번 - 스택 수열

     1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다
     push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. @@ =>
     임의의 수열이 주어졌을 때
     스택을 이용해 그 수열을 만들 수 있는지 없는지,
     있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지


    접근방식.
    - left stack (1~n까지 숫자 차례로 넣는 스택)
    - input (수열 값 하나씩 들어오는 것)
    - right stack (수열 만드는 스택)

    - 규칙 찾기
        - input 보다 작거나 같을 때까지 1씩 증가하며 left stack에 넣기
        - input보다 커지면 left stack pop() 해서 right stack에 넣기
        - (예제 2 참고) -> input이 peek() 값보다 작으면 수열을 만들 수 없음
        - push, pop 연산은 따로 배열 만들어서 '+'/'-' 집어넣기
        - 수열 가능 여부 flag 를 만들어서 true 일 때만 배열 출력하기
 */
public class BJ1874 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> left_stack = new Stack<>();
        Stack<Integer> right_stack = new Stack<>();
        List<Character> list = new ArrayList<>();

        int count = 1;
        boolean flag = true;

        for(int i=0; i<n; i++){
            int input = sc.nextInt();

            if(!left_stack.isEmpty() && left_stack.peek() > input){
                System.out.println("NO");
                flag = false;
                break;
            }

            while(count <= input){
                left_stack.push(count++);
                list.add('+');
            }
            // count > num
            right_stack.push(left_stack.pop());
            list.add('-');
        }

        if(flag){
            for(char c : list){
                System.out.println(c);
            }
        }
    }
}
