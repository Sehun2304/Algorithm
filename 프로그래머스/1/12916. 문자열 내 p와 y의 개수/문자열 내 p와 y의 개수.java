class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int ps = 0;
        int ys = 0;
        
        for(int i =0; i<s.length(); i++){
            char cha = s.charAt(i);
            
            if(cha=='p'|| cha=='P'){
                ps += 1;
            }else if(cha=='y'|| cha=='Y'){
                ys += 1;
            }
        }
        if(ps-ys==0){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}