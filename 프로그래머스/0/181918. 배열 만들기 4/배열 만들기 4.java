import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        stk.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stk.get(stk.size() - 1) < arr[i]) stk.add(arr[i]);
            if (stk.get(stk.size() - 2) >= arr[i]) stk.remove(stk.size() - 1);
        }
        int answer[] = new int[stk.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stk.get(i);
        }
        return answer;
    }
}