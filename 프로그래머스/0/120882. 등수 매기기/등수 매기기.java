import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        int[] rank = new int[score.length];
        Arrays.fill(rank, 1);
        for (int i = 0; i < score.length; i++) {
            answer[i] = (score[i][0] + score[i][1]) / (double)2;
        }
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[i] > answer[j]) rank[j]++;
                else if (answer[i] < answer[j]) rank[i]++;
            }
        }
        return rank;
    }
}