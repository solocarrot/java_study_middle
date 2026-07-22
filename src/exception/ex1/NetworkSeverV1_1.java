package exception.ex1;

public class NetworkSeverV1_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 clientV1 = new NetworkClientV1(address);
        clientV1.initError(data);

        clientV1.connect();
        clientV1.send(data);
        clientV1.disconnect();
    }
}
