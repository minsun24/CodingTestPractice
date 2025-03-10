import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] letterArr = letter.split(" ");
        String[] morseArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<String, Character> map = new HashMap<>(26);
        for (int i =0; i < morseArr.length; i++) {
            char alph = (char)('a'+i);
           map.put(morseArr[i], alph);
        }
        
        for (int i = 0; i < letterArr.length; i++) {
            answer.append(map.get(letterArr[i]));
        }
        
        return answer.toString();
    }
}