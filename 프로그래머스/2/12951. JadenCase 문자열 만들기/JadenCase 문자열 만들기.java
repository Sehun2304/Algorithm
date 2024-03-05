class Solution {
    public String solution(String s) {
        StringBuilder answerBuilder = new StringBuilder();
        boolean isFirst = true;

        for (char c : s.toCharArray()) {
            if (isFirst) {
                answerBuilder.append(Character.toUpperCase(c));
                isFirst = false;
            } else {
                if (Character.isAlphabetic(c)) {
                    answerBuilder.append(Character.toLowerCase(c));
                } else {
                    answerBuilder.append(c);
                }
            }

            isFirst = (c == ' ');
        }

        return answerBuilder.toString();
    }
}
