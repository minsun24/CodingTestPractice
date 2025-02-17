import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.Stream;

public class p4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        while (!input.equals(".")) {
            Stack<String> stack = new Stack<>();
            Stream.of(input.split("")).forEach(str -> {
                switch (str) {
                    case "(":
                        stack.push("(");
                        break;
                    case ")":
                        if(!stack.isEmpty() && stack.peek().equals("(")) stack.pop();
                        else stack.push(")");
                        break;
                    case "[":
                        stack.push("[");
                        break;
                    case "]":
                        if(!stack.isEmpty() && stack.peek().equals("[")) stack.pop();
                        else stack.push("]");
                        break;
                }
            });

            System.out.println(stack.isEmpty() ? "yes" : "no");
            input = br.readLine();
        }
    }
}
