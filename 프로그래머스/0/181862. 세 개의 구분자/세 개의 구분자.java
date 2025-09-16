class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("[a-c]", " ").trim().split("\\s+");
        if (answer[0].equals("")) {
            answer[0] = "EMPTY";
        }
        return answer;
    }
}