package week5;

/*
    - 오른쪽 스택은 필요가 없다.
    - 수열이 만들어지지 않으면, NO 출력 후 그냥 return 해서 끝내기 (flag 변수 제거)


 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BJ1874Advanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        List<Character> operations = new ArrayList<>();
        int count = 1;

        for(int i=0; i<n; i++){
            int input = sc.nextInt();

            // input값이 count보다 크다면, count부터 input까지 push 수행
            while(count <= input){
                stack.push(input);
                operations.add('+');
            }

            // 스택 peek()이 현재 input과 같다면 pop 수행
            if(stack.peek() == input) {
                stack.pop();
                operations.add('-');
            }else{
                System.out.println("NO");
                return;
            }
        }

        for (char op : operations) {
            System.out.println(op);
        }

    }
}
