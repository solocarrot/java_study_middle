package progammers;

public class Solution12916 {
    boolean solution(String s) {
        int pNum = 0;
        int yNum = 0;
        boolean answer = true;
        s = s.toLowerCase();
        String[] array = s.split("");
        for (int i = 0; i < s.length(); i++) {
            if (array[i].equals("p")) {
                pNum++;
            }
            if(array[i].equals("y")) {
                yNum++;
            }
        }

        if(pNum != yNum) {
            answer = false;
        }

        return answer;
    }
}
