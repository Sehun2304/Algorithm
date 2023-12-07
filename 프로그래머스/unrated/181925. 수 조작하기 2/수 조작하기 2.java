public class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int currentNum = numLog[0];

        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];

            if (diff == 1) {
                answer.append("w");
                currentNum += 1;
            } else if (diff == -1) {
                answer.append("s");
                currentNum -= 1;
            } else if (diff == 10) {
                answer.append("d");
                currentNum += 10;
            } else if (diff == -10) {
                answer.append("a");
                currentNum -= 10;
            }
        }

        return answer.toString();
    }
}
