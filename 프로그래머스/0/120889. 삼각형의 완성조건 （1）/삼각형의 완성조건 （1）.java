import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int max = sides[2];
        int sum = sides[0] + sides[1];
        
        if(max<sum){
            return 1;
        }else{
            return 2;
        }
      
    }
}