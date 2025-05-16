import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        Map<Integer, Integer> sizeCount = new HashMap<>();
        for (int size : tangerine) {
            sizeCount.put(size, sizeCount.getOrDefault(size, 0) + 1);
        } 
//getOrDefault는 Map에 해당 키가 존재하면 그 값을 반환하고, 없으면 지정한 기본값(defaultValue)을 반환하는 메서드

        List<Integer> counts = new ArrayList<>(sizeCount.values());
        counts.sort(Collections.reverseOrder());

        int answer = 0;
        int sum = 0;

        for (int count : counts) {
            sum += count;
            answer++;
            if (sum >= k) break;
        }

        return answer;
    }
}
