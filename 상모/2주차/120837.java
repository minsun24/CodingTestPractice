class P120837 {
    public int solution(int hp) {
        int answer = 0;
        if (hp % 5 == 0) {
            answer = hp / 5;
        } else if (hp % 5 % 3 == 0) {
            answer = hp / 5;
            answer += hp % 5 / 3;
        } else {
            answer = hp / 5;
            answer += hp % 5 / 3;
            answer += hp % 5 % 3;
        }
        return answer;
    }
}

// class P120837 {
//    public int solution(int hp) {
//        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
//    }
// }
