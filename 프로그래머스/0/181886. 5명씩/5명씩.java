class Solution {
    public String[] solution(String[] names) {
        String answer[] = new String[(names.length - 1) / 5 + 1];
        for (int i = 0; i * 5 < names.length; i++) {
            answer[i] = names[i * 5];
        }
        return answer;
    }
}