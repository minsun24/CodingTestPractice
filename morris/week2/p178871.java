class False {
    public String[] solution(String[] players, String[] callings) {
        String temp = "";
        for (int i = 0; i < callings.length; i++) {
            for (int j = 0; j < players.length; j++) {
                if (callings[i].equals(players[j])) {
                    temp = players[j-1];
                    players[j-1] = players[j];
                    players[j] = temp;
                }                
            }
        }
        return players;
    }
}

import java.util.Map;
import java.util.HashMap;

class Pass {
    public String[] solution(String[] players, String[] callings) {
        int index = 0;
        String temp = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);        
        }

        for (int i = 0; i < callings.length; i++) { 
            // 맵에서 이름 불린 선수의 인덱스 추출
            index = map.get(callings[i]);
            // players에서 이름 불린 선수의 앞 쪽 선수의 이름 추출하여 temp에 임시 저장
            temp = players[index - 1];

            // players에서 이름 불린 선수의 앞 쪽 선수 인덱스 자리에 이름 불린 선수 대입
            players[index -1] = players[index];
            // players에서 이름 불린 선수 자리에 앞 쪽 선수 이름 삽입
            players[index] = temp;

            // map에서 앞 쪽 선수의 index값을 +1로 값을 변경하여 순위를 낮춤
            map.put(temp, index);
            // map에서 이름 불린 선수의 index값을 -1로 조정하여 순위를 올림
            map.put(players[index -1], index-1);
        }
        return players;
    }
}
