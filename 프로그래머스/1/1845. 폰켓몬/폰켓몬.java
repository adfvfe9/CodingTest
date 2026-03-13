import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        
        for (int i : nums) {
            h.add(i);
        }
        
        return Math.min(nums.length / 2, h.size());
    }
}