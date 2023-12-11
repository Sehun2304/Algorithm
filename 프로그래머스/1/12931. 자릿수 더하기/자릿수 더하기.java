import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String x = String.valueOf(n);
        for(int i =0; i<x.length(); i++){
            char cha = x.charAt(i);
            answer += Character.getNumericValue(cha);
        }

        return answer;
    }
}