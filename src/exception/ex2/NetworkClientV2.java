package exception.ex2;

public class NetworkClientV2 {
    //클라이언트는 배달부역할이니까 주소를 받고시작한뒤에 연결이랑 해재랑 보내기 메서드가 있으면됨
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }
    public void connect() throws NetworkClientExceptionV2{
        if(connectError) {
            throw new NetworkClientExceptionV2("connectError" , address + "서버연결실패");
        }
        System.out.println(address + "서버 연결성공");
    }

    public void send(String message) throws NetworkClientExceptionV2{
        if(sendError) {
            throw new NetworkClientExceptionV2("sendError" , address + "메세지 전송 실패");
        }
        System.out.println(address + "서버에 데이터 전송 성공" + message);
    }

    public void disconnect() {
        System.out.println("연결해제");
    }

    public void initError(String message) {
        if(message.contains("Error1")){
            connectError = true;
        }
        if(message.contains("Error2")){
            sendError = true;
        }
    }

}
