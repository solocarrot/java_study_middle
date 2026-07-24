package exception.ex1;

public class NetworkSeverV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 clientV1 = new NetworkClientV1(address);
        clientV1.initError(data);
        //자 만약에 data에 error1이 입력이되었다치자 그러면 커넥트에러가 펄스가되겠지

        String connectResult = clientV1.connect();
        //만약에 error1이 들어왔으면 얘는 서버연결실패가되는거야.
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }

        //뭐지 어떻게해야되는거지 먼저 서버연결에 실패했을때2줄만 나오게끔하는방법부터생각해보자
        String sendResult = clientV1.send(data);
        if(isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }

        clientV1.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
        //리절트코드가 success아니면 true반환
    }
}
