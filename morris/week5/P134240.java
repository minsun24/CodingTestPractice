class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int div = food[i] / 2;
            for (int j = 1; j <= div; j++) {
                answer.append(i);
            }
        }
        for (int i = answer.toString().length() - 1; i >= 0; i--) {
            sb.append(answer.toString().charAt(i));
        }
        answer.append("0"+sb.toString());
        return answer.toString();
    }
}