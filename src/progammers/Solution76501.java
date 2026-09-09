package progammers;

public class Solution76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            int sign = 0;
            if (signs[i]) {
                sign = 1;
            } else if(!signs[i]) {
                sign = -1;
            }
            answer += absolutes[i] * sign;
        }
        return answer;
    }
}
