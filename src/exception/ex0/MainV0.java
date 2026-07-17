package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NetworkServiceV0 networkServiceV0 = new NetworkServiceV0();

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkServiceV0.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램종료");

    }
}
