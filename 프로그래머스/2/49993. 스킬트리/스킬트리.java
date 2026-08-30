class Solution {
    public int solution(String skill, String[] skill_trees) {
        int index = 0;
        int answer = 0;
        for (String s : skill_trees) {
            index = 0;
            boolean flag = true;
            //System.out.println(s + " : ");
            for (char c : s.toCharArray()) {
                // if (index < skill.length()) {
                //     System.out.println(skill.charAt(index) + " / " + c);
                // } else {
                //     System.out.println("길이초과");
                // }
                if (index < skill.length() && c == skill.charAt(index)) {
                    index++;
                    flag = true;
                } else if (skill.contains(Character.toString(c))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
        }
        return answer;
    }
}
// skill 문자열의 글자 index를 저장하는 변수 하나 지정하고
// skill_trees의 각 요소를 순회하고 각 요소에서 글자 하나씩 끄집어내서
// 현재 skill의 i번째 글자가나왓는지?? 체크하면되나 안될것같은데 뭔가