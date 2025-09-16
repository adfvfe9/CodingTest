import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 1; j <= arr[i] * 2; j++) {
                    a.add(arr[i]);
                }
            } else {
                for (int j = 1; j <= arr[i]; j++) {
                    a.remove(a.size() - 1);
                }
            }
        }
        int answer[] = new int[a.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }
}