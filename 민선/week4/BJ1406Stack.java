package week4;

/*
    문제. 백준  1406번 - 에디터

    스택(Stack)으로 풀기

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class BJ1406Stack {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 문자열 입력
        String str = br.readLine();

        // 명령어 개수
        int M = Integer.parseInt(br.readLine());

        // 스택 2개 - 커서 기준 왼쪽 | 오른쪽
        Stack<Character> leftStack = new Stack<>();     // 커서 왼쪽 스택
        Stack<Character> rightStack = new Stack<>();    // 커서 오른쪽 스택

        // 입력받은 문자열을 왼쪽 스택에 모두 집어넣기
        for(char ch : str.toCharArray()){
            leftStack.push(ch);
        }

        // 명령어 처리
        for(int i=0; i<M; i++){
            String command = br.readLine();
            char cmd = command.charAt(0);

            switch(cmd){ // 커서를 왼쪽으로 한 칸 옮김
                case 'L' :
                    if(!leftStack.isEmpty()){   // 커서가 문장의 맨 앞이 아니면,
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case 'D':
                    if(!rightStack.isEmpty()){  // 커서가 문장의 맨 뒤가 아니라면,
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case 'B':
                    if(!leftStack.isEmpty()){   // 커서가 문장의 맨 앞이 아니면,
                        leftStack.pop();
                    }
                    break;
                case 'P':
                    leftStack.push(command.charAt(2));
                    break;
            }
        }

        // 결과 출력    leftStack + 뒤집어진 RightStack
        while(!leftStack.isEmpty()){
            sb.append(leftStack.pop());
        }
        sb.reverse();   // 왼쪽 스택 값
        while(!rightStack.isEmpty()){
            sb.append(rightStack.pop());
        }
        // 오른쪽 스택 값을 뒤집어진채 그대로 출력해야 한다.
        System.out.println(sb.toString());

    }
}
