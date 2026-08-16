package progammers;

class Solution12932 {
    public int[] solution(long n) {
        long temp = n;
        int arrayLength = 0;
        while(n > 0) {
            n = n / 10;
            arrayLength++;
        }
        int[] answer = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            answer[i] = (int) (temp % 10);
            temp = temp / 10;
        }
        return answer;
    }
}