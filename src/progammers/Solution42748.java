package progammers;
import java.util.Arrays;

public class Solution42748 {
    int answerNum = 0;
    public int[] solution(int[] array, int[][] commands) {
        for(int i = 0 ;  i < commands.length ; i++){
            answerNum++;
            for(int j = 0 ; j < commands[i].length ; j++){
                int[] sortArray = new int[commands[i][1] - commands[i][0] + 1];
                for(int k = 0; k < sortArray.length; k++){
                    sortArray[k] = array[commands[i][0] + k];

                }

            }
        }
        int[] answer = new int[answerNum];
        return answer;
    }

}
