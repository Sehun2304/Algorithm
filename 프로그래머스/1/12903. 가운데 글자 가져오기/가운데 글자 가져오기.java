class Solution {
    public String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 1) {
            int center = s.length() / 2;
            answer = s.substring(center, center + 1);
        } 
        else {
            int center = s.length() / 2 - 1;
            answer = s.substring(center, center + 2);
        }
        
        return answer;
    }
}