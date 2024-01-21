class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalPrice =0;
        
        for(int i=1; i<=count; i++){
            totalPrice += i*price; 
        }
        
        if(money-totalPrice<0){
            answer = totalPrice - money;
        }else{
            answer = 0;
        }
        return answer;
    }
}