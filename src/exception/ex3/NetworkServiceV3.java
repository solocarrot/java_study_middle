package exception.ex3;

import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;
import exception.ex3.exception.ConnectExceptionV3;

public class NetworkServiceV3 {

    public void sendMessage(String data) {
        String address =  "https://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try{
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결오류] 주소: " + address + "메시지" + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송오류] 전송 데이터: " + data + "메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }



    }

}
