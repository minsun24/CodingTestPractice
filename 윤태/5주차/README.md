# 자료 구조 1(스택, 큐, 우선순위 큐)

발표 시작으로 2주차 주제부터 다시<br><br>

1. [2164-카드2](https://www.acmicpc.net/problem/2164)
   <br>
   처음 접근: 큐 구조로 접근
   <br><br>
   오답 이유: 정답 but (45528KB, 160ms) <=> (11636, 64ms)
   <br><br>
   해결: 규칙이 있음.<br>
   주어진 수(N)이 2의 거듭제곱이면 자기 자신이 정답<br>
   N이 2의 거듭제곱이 아니면 2 \* (N - 2\*\*k)
   <br><br>

2. [4949-균형잡힌 세상](https://www.acmicpc.net/problem/4949)
   <br>
   처음 접근: 스택을 구현하여 여는 괄호는 무조건 push, 닫는 괄호면 조건 검사 후 pop or push
   <br><br>
   오답 이유: stack.peek() 시 stack이 비어있으면 예외 발생.<br>
   stack을 while문 밖에서 생성하여 이전 문장의 괄호가 남았을 때 논리적 오류
   <br><br>
   해결: 조건문에 isEmpty() 추가 및 while문 안에서 stack 선언 및 초기화
   <br><br>
