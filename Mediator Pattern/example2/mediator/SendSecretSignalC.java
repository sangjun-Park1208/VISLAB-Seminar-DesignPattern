package mediator;

import java.util.ArrayList;

public class SendSecretSignalC extends Mediator{
    private String securityPassword;
    public SendSecretSignalC(String securityPassword){
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
        System.out.println("비밀번호를 확인 중 입니다...");

        // add - 유저에게 전달받은 비밀번호와 중재자 자체 비밀번호가 일치할시 SecretSignal 수신했다고 출력하기
        if(password == this.securityPassword){
            for (Colleague c : colleagues){
            System.out.println("<< " + c.getName());            
            System.out.println("SecretSignal을 수신하였습니다.");
        }
        }
        else{
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }
}
