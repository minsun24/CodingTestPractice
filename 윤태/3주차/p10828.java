import java.util.Scanner;
import java.util.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10828 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		MyStack myStack = new MyStack(10101);
		StringBuilder sb = new StringBuilder();
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			if (cmd.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				myStack.push(x);
			} else if (cmd.equals("pop")) {
				sb.append(myStack.pop()).append("\n");
			} else if (cmd.equals("size")) {
				sb.append(myStack.size()).append("\n");
			} else if (cmd.equals("empty")) {
				sb.append(myStack.isEmpty() ? 1 : 0).append("\n");
			} else if (cmd.equals("top")) {
				sb.append(myStack.top()).append("\n");
			} else {
				throw new IllegalStateException();
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
    
	public static void myAnswer() {
		Stack<String> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int comLen = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < comLen; i++) {
            String command = sc.nextLine();
            String[] splitedCommand = command.split(" ");
            switch (splitedCommand[0]) {
                case "push":
                    stack.push(splitedCommand[1]);
                    break;
                case "pop":
                    System.out.println(stack.empty() ? -1 : stack.pop());
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;
                
                case "empty":
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
                
                case "top":
                    System.out.println(stack.empty() ? -1 : stack.peek());
                    break;
                    
                default:
                    break;
            }
		}
		sc.close();
	}
}
class MyStack {
    private final int[] stack;
	private int top;

	MyStack(int size) {
		this.stack = new int[size];
		this.top = -1;
	}

	void push(int x) {
		stack[++top] = x;
	}

	int pop() {
		return isEmpty() ? -1 : stack[top--];
	}

	int size() {
		return top + 1;
	}

	boolean isEmpty() {
		return top == -1;
	}

	int top() {
		return isEmpty() ? -1 : stack[top];
	}
}