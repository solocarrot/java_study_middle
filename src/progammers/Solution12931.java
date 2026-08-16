package progammers;

import java.util.*;

public class Solution12931 {
    public static class Solution {
        public int solution(int n) {
            int answer = 0;
            while (n > 0) {
                answer += n % 10;
                n = n / 10;
            }


            return answer;
        }
    }
}
