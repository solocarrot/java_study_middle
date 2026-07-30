package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NetworkServiceV3_2 service = new NetworkServiceV3_2();

        while(true) {
            System.out.println("데이터를 입력하세요: ");
            String enter = scanner.nextLine();
            if (enter.equals("exit")){
                break;
            }
            service.sendMessage(enter);
            System.out.println();
        }
        System.out.println("서비스 정상종료");
    }
}
