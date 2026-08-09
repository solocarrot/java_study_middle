package progammers;

public class Solution12925 {
    public int solution(String s) {
        //문자열 s를 숫자로 변환시키기
        //ex1) 12345가입력됨. 문자열을 char의 배열으로 집어넣고싶다.
        int answer = 0;
        int arrayLength = s.length();


        char[] charArray = new char[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            charArray[i] = s.charAt(i);
        }

        int superScript = 5;
        for(int i = 0; i < arrayLength; i++) {
//            if(isSign(charArray[i])) {
//                superScript--;
//
//            }
            int num1 = charArray[i] - 48;
            int num2 = superScript(superScript);
            superScript--;
            answer += num1 * num2;
        }

        return answer;
    }

//    private char isSign(char c) {
//        if(c == '+' ) {
//            return ' ';
//        } else if (c == '-') {
//            return '-';
//        }
//    }

    private int superScript(int n) {
        int result = 1;
        while(n == 1) {
            result = result * 10;
            n--;
        }
        return result;
    }
}
