package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NetworkSeverV1_1 severV1_1 = new NetworkSeverV1_1();h
        while(true) {
            String data = scanner.nextLine();
            if (data.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            severV1_1.sendMessage(data);
        }
    }
}
