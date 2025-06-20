class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String pol[] = binomial.split(" ");
        switch (pol[1]) {
            case "+" : return Integer.valueOf(pol[0]) + Integer.valueOf(pol[2]);
            case "-" : return Integer.valueOf(pol[0]) - Integer.valueOf(pol[2]);
            case "*" : return Integer.valueOf(pol[0]) * Integer.valueOf(pol[2]);
            case "/" : return Integer.valueOf(pol[0]) / Integer.valueOf(pol[2]);
        }
        return answer;
    }
}