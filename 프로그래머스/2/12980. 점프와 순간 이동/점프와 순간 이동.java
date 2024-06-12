import java.util.*;

public class Solution {
    public int solution(int n) {
        int batteryUsage = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                batteryUsage += 1;
            }
        }

        return batteryUsage;
    }
}