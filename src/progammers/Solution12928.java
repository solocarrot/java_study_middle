package progammers;

import java.util.Scanner;

public class Solution12928 {
    //1. 약수를 구하는 메서드 만들기 2. 두개를 더하는메서드만들기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        int enter = scanner.nextInt();
        int range = getRange(enter);

        int sum = getSum(range, enter);
        System.out.println(sum);


    }

    public static int getRange(int enter) {
        int i = 0;
        while(i * i <= enter) {
            //36일 경우에 =이 있으면 6이해당이되서 5가나가게됨
            i++;
        }
        return  i - 1;
    }

    public static int getSum(int range, int enter) {
        int i = 1;
        int sum = 0;
        while(i <= range) {
            if (isRest(i, enter) == true) {
                i++;
            } else {
                int j = enter / i;
                if( i == j) {
                    sum += i;
                    i++;
                    continue;
                }
                sum += i;
                sum += j;
                i++;
            }
        }
        return sum;
    }

    public static boolean isRest(int i, int enter) {
        if(enter % i != 0) {
            return true;
        } else return false;
    }
}
