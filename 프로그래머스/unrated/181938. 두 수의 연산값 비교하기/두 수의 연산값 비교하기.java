class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str_ab = Integer.toString(a) + Integer.toString(b);
        
        if(Integer.parseInt(str_ab) >= 2*a*b){
            answer = Integer.parseInt(str_ab);
        }else{
            answer = 2*a*b;
        }
        return answer;
    }
}