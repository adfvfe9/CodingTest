class Solution {
    public int[] solution(int brown, int yellow) {
        int allTile = brown + yellow;
        for (int i = 3; i <= allTile / 3; i++) {
            if (allTile % i == 0) {
                if (brown == allTile / i * 2 + (i - 2) * 2) {
                    return new int[]{Math.max(allTile / i, i), Math.min(allTile / i, i)};
                }
            }
        }
        return new int[]{};
    }
}