package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2{
        Scanner scanner = new Scanner(System.in);

        NetworkSeverV2_1 sever = new NetworkSeverV2_1();
        while(true) {
            System.out.println("전송할 문자");
            String data = scanner.nextLine();
            if(data.equals("exit")) {
                break;
            }
            sever.sendMessage(data);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다");
    }

}
