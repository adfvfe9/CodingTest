import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int temp[] = new int[arr.length];
        while (true) {
            temp = arr.clone();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] *= 2;
                    arr[i]++;
                }
            }
            if (Arrays.equals(arr, temp)) {
                break;
            }
            answer++;
        }
        return answer;
    }
}