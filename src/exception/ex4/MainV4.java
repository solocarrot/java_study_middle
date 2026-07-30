package exception.ex4;

import exception.ex4.exception.SendException;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        NetworkServiceV4 service = new NetworkServiceV4();
        while (true) {
            System.out.print("메시지를 입력하세요: ");
            String init = scanner.nextLine();

            if(init.equals("exit")) {
                break;
            }

            try{
                service.sendData(init);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램 정상종료");
    }

    public static void exceptionHandler(Exception e) {
        System.out.println("죄송합니다 알수없는 오류가발생했습니다.");
        e.printStackTrace(System.out);

        if( e instanceof SendException sendEx) {
            System.out.println("[전송오류} 전송 데이터: " + sendEx.getSendData());
        }
    }
}
