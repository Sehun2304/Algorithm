import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] ch = Long.toString(n).toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder(new String(ch));
        sb.reverse();
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}