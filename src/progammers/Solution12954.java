package progammers;

public class Solution12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int temp = x;

        for(int i=0; i < n; i++){
            answer[i] = x;
            x += temp;
        }
        return answer;
    }
}
