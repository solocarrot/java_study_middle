package progammers;

class Solution12912 {
    public long solution(int a, int b) {
        long answer = 0;
        //a와 b에 속한 모두 정수의 합을 리턴하기.
        //조건1. 같은경우 아무거나하기, 조건2 대소관계정해져있지않음.
        long bigNum = Math.max(a,b);
        long smallNum = Math.min(a,b);
        for(long i = smallNum; i <= bigNum; i++) {
            answer += i;
        }
        return answer;
    }


}