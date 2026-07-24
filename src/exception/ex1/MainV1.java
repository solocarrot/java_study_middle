package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NetworkSeverV1_2 severV1_1 = new NetworkSeverV1_2();
        while(true) {
            System.out.print("전송할 문자 : ");
            String data = scanner.nextLine();
            if (data.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            severV1_1.sendMessage(data);
        }
    }
}
