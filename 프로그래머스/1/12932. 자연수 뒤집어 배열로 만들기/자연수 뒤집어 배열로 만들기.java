import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String reversed = new StringBuilder(Long.toString(n)).reverse().toString();
        return Arrays.stream(reversed.split("")).mapToInt(Integer::parseInt).toArray();
        }
    }
