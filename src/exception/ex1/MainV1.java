package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NetworkSeverV1_1 severV1_1 = new NetworkSeverV1_1();
        severV1_1.sendMessage("hello");

        NetworkSeverV1_1 severV1_2 = new NetworkSeverV1_1();
        severV1_2.sendMessage("error1");

        severV1_2.sendMessage("error2");
    }
}
