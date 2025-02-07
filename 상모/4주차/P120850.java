import java.util.Arrays;

class P120850 {
    public int[] solution(String my_string) {
        StringBuilder stb = new StringBuilder();
        
        for (char ch : my_string.toCharArray()) {
            int num = ch - '0';

            if (num <= 9) {
                stb.append(num);
            }            
        }
        
        int[] answer = new int[stb.length()];
        
        for (int i = 0; i < stb.length(); i++) {
            answer[i] = stb.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        return answer;
    }
}