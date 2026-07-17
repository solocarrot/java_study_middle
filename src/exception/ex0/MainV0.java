package exception.ex0;

import java.util.Scanner;

public class MainV0 {

    public static void main(String[] args) {

        NetworkServiceV0 networkServiceV0 = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        networkServiceV0.sendMessage(input);
    }
}
