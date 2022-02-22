package mediator;

import java.util.ArrayList;

public class SendSecretSignalB extends Mediator{
    private String securityPassword;
    public SendSecretSignalB(String securityPassword){
        this.securityPassword = securityPassword;
        this.createColleagues();
        System.out.println("중재자 생성이 되었습니다.");
    }

    @Override
    public void createColleagues() {
        colleagues = new ArrayList<>();
    }

    @Override
    public void mediate(String password, String user) {
        // add - user 님의 Secret Signal 확인하기 출력
        System.out.println(">> " + user + "로부터 메시지를 받았습니다.");
        // add - 유저에게 전달받은 비밀번호와 중재자 자체 비밀번호가 일치할시 SecretSignal 수신했다고 출력하기
        if (password == this.securityPassword) {
            System.out.println("secret signal 수신");
            for (Colleague c : colleagues){
            System.out.println("<< " + c.getName());
            c.message(password);
        }
        } else {
            System.out.println("비밀번호가 일치하지 않음");
        }
    }
}
