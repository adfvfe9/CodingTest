class Solution {
    public int solution(int[] num_list) {
        boolean b = true;
        int osum = 0, esum = 0;
        for (int i : num_list) {
            if (b) {
                osum += i;
            } else {
                esum += i;
            }
            b = !b;
        }
        return (osum > esum) ? osum : esum;
    }
}