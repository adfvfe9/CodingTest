import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        
        Arrays.sort(arr);
        for (int i : arr) {
            if (i % divisor == 0) cnt++;
        }
        int answer[] = new int[(cnt == 0) ? 1 : cnt];
        answer[0] = -1;
        cnt = 0;
        for (int i : arr) {
            if (i % divisor == 0) answer[cnt++] = i;
        }
        return answer;
    }
}