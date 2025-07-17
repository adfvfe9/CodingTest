class Solution {
    public int solution(int[] common) {
        if (common[2] - common[1] == common[1] - common[0]) return common[common.length - 1] * 2 - common[common.length - 2];
        else return common[common.length - 1] * common[common.length - 1] / common[common.length - 2];
    }
}