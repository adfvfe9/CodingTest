import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hs = new HashMap<>();
        for (String i : participant) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }
        for (String i : completion) {
            hs.put(i, hs.get(i) - 1);
        }
        for (String i : hs.keySet()) {
            if (hs.get(i) == 1) {
                return i;
            }
        }
        
        return "";
    }
}

// 1. HashMap 1 만들어서 participant 요소를 이름, 횟수로 저장
// 2. completion 순회하면서 나온놈 값을 1 줄이기
// 3. 마지막에 value가 1인놈 찾으면 끝?