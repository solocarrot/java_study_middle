package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data){
        String address = "http://example.com";

        NetworkClientV2 networkClientV2 = new NetworkClientV2(address);
        networkClientV2.initError(data);

        try{
            networkClientV2.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류코드: " + e.getErrorCode() + "오류메시지 : " +e.getMessage());
            return;
        }
        try {
            networkClientV2.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류코드: " + e.getErrorCode() + "오류메시지 : " +e.getMessage());
            return;
        }
        networkClientV2.disconnect();
    }

}
