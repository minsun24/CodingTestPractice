import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class p5430 {
    ///////////////////////////////////////////////////////////////////////////////// 초기 정답
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    
        int tryCount = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < tryCount; i++) {
            String commands = br.readLine();  
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            input = input.substring(1, input.length() - 1);
            LinkedList<String> deque = new LinkedList<>();

            if (!input.isEmpty()) {
                String[] values = input.split(",");  
                deque.addAll(Arrays.asList(values));
            }

            boolean reversed = false;  
            boolean error = false;  

            for (char cmd : commands.toCharArray()) {
                if (cmd == 'R') {
                    reversed = !reversed;  
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {  
                        error = true;
                        break;
                    }
                    if (reversed) {
                        deque.pollLast();  
                    } else {
                        deque.pollFirst();  
                    }
                }
            }

            // 출력
            if (error) {
                sb.append("error\n");
            } else {
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(reversed ? deque.pollLast() : deque.pollFirst());
                    if (!deque.isEmpty()) sb.append(",");
                }
                sb.append("]\n");
            }
        }

        System.out.print(sb);
    }
    
    ///////////////////////////////////////////////////////////////////////////////// 너무 어려워요
    public static void solution() throws IOException {
        int T = 0;
        int in = System.in.read();
        while (in > 32) {
            T = (T << 3) + (T << 1) + (in & 15);
            in = System.in.read();
        }
        
        if (T == 0)
            return;
        
        final byte[] error = {'e','r','r','o','r','\n'};
        
        int[] sa = new int[100000];
        int[] la = new int[100000];
        byte[] buf = new byte[2000000];
        byte[] out = new byte[2000000];
        System.in.read(buf, 0, buf.length);
        int idx = -1;
        int oi = 0;
        
        while (--T != -1) {
            int count = 0;
            int pStart = idx + 1;
            while (buf[++idx] > 32)
                if (buf[idx] == 'D')
                    ++count;
            int pEnd = idx;
            
            int n = 0;
            while (buf[++idx] > 32)
                n = (n << 3) + (n << 1) + (buf[idx] & 15);
            
            ++idx;
            for (int i = 0; i < n; i++) {
                sa[i] = idx + 1;
                while (buf[++idx] != ',' && buf[idx] != ']');
                la[i] = idx - sa[i];
            }
            ++idx;
            
            if (n == 0)
                ++idx;
            
            if (count > n) {
                System.arraycopy(error, 0, out, oi, 6);
                oi += 6;
                continue;
            }
            
            if (count == n) {
                out[oi] = '[';
                out[oi + 1] = ']';
                out[oi + 2] = '\n';
                oi += 3;
                continue;
            }
            
            boolean reversed = false;
            int front = 0;
            int back = n - 1;
            for (int i = pStart; i < pEnd; i++) {
                if (buf[i] == 'R')
                    reversed = !reversed;
                else {
                    if (reversed)
                        back--;
                    else
                        front++;
                }
            }
            
            out[oi++] = '[';
            if (reversed) {
                for (int i = back; i >= front;) {
                    System.arraycopy(buf, sa[i], out, oi, la[i]);
                    out[oi + la[i]] = ',';
                    oi += la[i--] + 1;
                }
            } else {
                for (int i = front; i <= back;) {
                    System.arraycopy(buf, sa[i], out, oi, la[i]);
                    out[oi + la[i]] = ',';
                    oi += la[i++] + 1;
                }
            }
            out[oi - 1] = ']';
            out[oi++] = '\n';
        }
        
        System.out.write(out, 0, oi);
    }
}