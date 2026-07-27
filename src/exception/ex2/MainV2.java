package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2{
        Scanner scanner = new Scanner(System.in);

        NetworkSeverV2_1 sever = new NetworkSeverV2_1();
        sever.sendMessage("hello");

    }

}
