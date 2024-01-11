class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] digits = Integer.toString(x).split("");
        for(String digit : digits){
            sum += Integer.parseInt(digit);
        }
        
        if(x % sum !=0){
            answer = false;
        }
        return answer;
    }
}