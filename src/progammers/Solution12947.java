package progammers;

public class Solution12947 {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp = temp /10 ;
        }
        boolean answer = true;
        if (x % sum == 0) {
            answer = true;

        } else {
            answer = false;
        }
        return answer;
    }


}
