import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int answer[] = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                int index = Arrays.asList(name).indexOf(photo[i][j]);
                answer[i] += (index == -1) ? 0 : yearning[index];
            }
        }
        
        return answer;
    }
}