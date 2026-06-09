import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> foods = new PriorityQueue<>();
        int answer = 0;
        
        for (int i : scoville) {
            foods.add(i);
        }
        
        while (foods.peek() < K && foods.size() >= 2) {
            foods.add(foods.remove() + foods.remove() * 2);
            answer++;
        }
        
        return (foods.peek() >= K) ? answer : -1;
    }
}