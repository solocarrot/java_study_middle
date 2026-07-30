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
            throw new ConnectExceptionV3(address, address + "서버 연결실패");
        }

        System.out.println("서버명: " + address + "연결성공");

    }

    public void send(String data) throws SendExceptionV3{
        if(sendError){
            throw new SendExceptionV3(data, address + "서버에 데이터 전송실패");
        }

        System.out.println("전송메시지: " + data + "전송성공");
    }

    public void disconnect() {
        System.out.println("서버연결해제");
    }

    public void initError(String data) {
        if(data.contains("Error1")){
            connectError = true;
        }
        if(data.contains("Error2")){
            sendError = true;
        }
    }
}
