import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if(heap.size() == 0) sb.append("0\n");
                else sb.append(heap.poll() + "\n");
            } else {
                heap.add(input);
            }
        }
        System.out.println(sb.toString());
    }
}
