import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class P10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String[]> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            members.add(br.readLine().split(" "));
        }

        members.sort(Comparator.comparingInt(m -> Integer.parseInt(m[0])));

        StringBuilder sb = new StringBuilder();

        for (String[] member : members) {
            sb.append(member[0]).append(" ").append(member[1]).append("\n");
        }

        System.out.println(sb.toString());
    }

    static class Member {
        int age;            // 나이
        String name;        // 이름
        int idx;            // 입력 순서
    
        public Member(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }
    }

    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members.add(new Member(age, name, i));
        }

        members.sort(Comparator.comparingInt(m -> m.age));

        StringBuilder sb = new StringBuilder();
        for (Member m : members) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }
        System.out.println(sb.toString());
    }

    
}
