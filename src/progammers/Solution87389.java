package progammers;

public class Solution87389 {
    public int solution(int n) {
        int answer = 0;
        int realN = n - 1;
        boolean isPair = false;

        for (int i = 2; i < realN / 2; i++) {
            if (realN % i == 0) {
                isPair = true;
                answer = i;
                break;
            }
        }
        if(isPair == false) {
            answer = realN;
        }
        return answer;
    }
}
