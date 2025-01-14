class p76501 {
    public int p76501(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                answer += absolutes[i] * -1;
            } else {
                answer += absolutes[i];
            }
        }
        return answer;
    }
}