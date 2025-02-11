class P120834 {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String ageStr = String.valueOf(age);
        
        for (char ch : ageStr.toCharArray()) {
            answer.append((char)(ch - '0' + 'a'));
        }
        
        return answer.toString();
    }
}