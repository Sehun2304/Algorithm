class Solution {
    
    private int countOne(int x) {
        int count = 0;
        while (x > 0) {
            if ((x & 1) == 1) { 
                count++;
            }
            x >>= 1; 
        }
        return count;
    }

    
    public int solution(int n) {
        int originalCount = countOne(n); 
        int nextNumber = n + 1; 
        
       
        while (countOne(nextNumber) != originalCount) {
            nextNumber++;
        }
        
        return nextNumber; 
    }
}
