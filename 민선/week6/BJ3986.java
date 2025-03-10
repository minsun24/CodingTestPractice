package week6;
/*
    문제. 백준 3986번 - 좋은 단어
    모든 글자가 A와 B로 바뀌어 버렸다!

    접근 방식. 괄호 스택처럼 접근


* */

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BJ3986 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int count = 0;

        for(int i=0; i<n; i++){
            String str = sc.nextLine();

            char[] charList = str.toCharArray();

            Stack<Character> stack = new Stack<>();

            for(int j=0; j<charList.length; j++){
                if(stack.isEmpty()){
                    stack.push(charList[j]);
                }else{
                    if(stack.peek() == charList[j]){
                        stack.pop();
                    }else{
                        stack.push(charList[j]);
                    }
                }
            }
            if(stack.isEmpty()){
                count ++;
            }

        }
        System.out.println(count);

    }
}
