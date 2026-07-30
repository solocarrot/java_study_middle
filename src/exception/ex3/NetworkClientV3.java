package exception.ex3;

import exception.ex3.exception.SendExceptionV3;
import exception.ex3.exception.ConnectExceptionV3;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3{
        if(connectError){
            System.out.println("");
        }

        System.out.println("서버명: " + address + "연결성공");

    }

    public void send() throws SendExceptionV3{
        if(sendError){
            System.out.println("");
        }

        System.out.println("전송메시지: " + data + "전송실패");
    }

    public boolean initError(String data) {
        if(data.contains("Error1")){
            connectError = true;
        }
        if(data.contains("Error2")){
            sendError = true;
        }

    }





}
