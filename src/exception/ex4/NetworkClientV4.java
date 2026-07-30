package exception.ex4;

import exception.ex4.exception.ConnectException;
import exception.ex4.exception.SendException;

public class NetworkClientV4 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() {
        if(connectError) {
            throw new ConnectException(address, address + "서버연결실패");
        }

        System.out.println("서버연결성공");
    }

    public void send(String data) {
        if(sendError) {
            throw new SendException(data, address + "메세지전송실패");
        }
    }

    public void disconnect() {
        System.out.println("서버연결종료");
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
