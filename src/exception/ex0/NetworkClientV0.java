package exception.ex0;

public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println("연결성공");
        return "success";
    }

    public String send(String data) {
        System.out.println(address + "서버에 데이터전송" + data);
        return "success";
    }

    public String disconnect() {
        System.out.println("해제성공");
        return "success";
    }
}

