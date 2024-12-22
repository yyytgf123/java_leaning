package Poly.sender;

public class SmsSender implements Sender{

    @Override
    public void sendMessage(String a) {
        System.out.println("SMS를 발송합니다 : " + a);
    }
}
