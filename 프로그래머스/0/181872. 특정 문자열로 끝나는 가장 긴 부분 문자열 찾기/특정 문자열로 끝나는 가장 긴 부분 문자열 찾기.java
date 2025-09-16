class Solution {
    public String solution(String myString, String pat) {
        StringBuilder str = new StringBuilder(myString);
        while (true) {
            if (str.toString().endsWith(pat)) {
                break;
            }
            str.delete(str.length() - 1, str.length());
        }
        return str.toString();
    }
}