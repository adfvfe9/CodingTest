class Solution {
    public int solution(int n) {
        int i;
        int cnt = 0;
        for (i = 1; cnt != n; i++) {
            if (Integer.toString(i).contains("3") || i % 3 == 0) {
                continue;
            }
            cnt++;
        }
        return i - 1;
    }
}