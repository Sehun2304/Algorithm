import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        
        int[] numArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numArray[i] = Integer.parseInt(numbers[i]);
        }
        
        Arrays.sort(numArray);
        int min = numArray[0];
        int max = numArray[numArray.length - 1];
        
        return min + " " + max;
    }
}
