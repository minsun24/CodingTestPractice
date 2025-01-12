/*
    4949번 : 균형잡힌 세상
    괄호들의 균형이 잘 맞춰져 있는지 판단하는 프로그램을 짜는 것
    괄호는 소괄호("()") 와 대괄호("[]")로 2종류

    # 접근
        - 괄호 문제 -> 스택?
        - 스택 모듈 모름. ArrayList로 해보자.
        - pop() : list.remove(list.size() - 1)
        - list.isEmpty()
        - 열린 괄호는 무조건 스택으로 넣기
        - 닫힌 괄호가 오면, 스택을 pop해서
            pop한 값이 열린 괄호이면 -> continue
            스택이 empty하거나  pop한 값이 짝이 맞지 않으면 -> boolean false로 변경 (-> no 출력)

 */
import java.util.*;
public class BJ4949 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "";

        while(true){
            ArrayList<String> lst = new ArrayList<>();  // 스택처럼 사용
            str = sc.nextLine();
            // 입력 종료 조건: 마침표 하나만 입력되면 종료
            if (str.equals(".")) {
                break;
            }

            boolean isBalanced = true;  // 균형 상태 확인

            for(int i=0; i<str.length(); i++){
                String it = Character.toString(str.charAt(i));

                // 여는 괄호는 스택에 추가
                if(it.equals("(") || it.equals("[")){
                    lst.add(it);
                }else if(it.equals(")")){
                    if(lst.isEmpty() || !lst.remove(lst.size() -1).equals("(")){
                        isBalanced = false;
                        break;
                    }
                }else if(it.equals("]")){
                    if(lst.isEmpty() || !lst.remove(lst.size() -1).equals("[")){
                        isBalanced = false;
                        break;
                    }
                }

            }
            // 결과 출력
            if (isBalanced && lst.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
