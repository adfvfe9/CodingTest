import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", "");
            if (!babbling[i].matches("[a-z]{1,}")) answer++;
        }
        return answer;
    }
}