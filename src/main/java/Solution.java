import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean judgeSquareSum(int c) {
        long num = 0;
        Set<Long> set = new HashSet<>();
        while(num * num <= c) {
            set.add(num * num);
            if(set.contains(c - num * num)){
                return true;
            }
            num++;
        }

        return false;
    }
}
