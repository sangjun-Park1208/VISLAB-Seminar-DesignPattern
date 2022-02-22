package mediator;

import java.util.ArrayList;

public class SendMessage extends Mediator{
    public SendMessage(){
        this.createColleagues();
        System.out.println("중재자 생성이 되었습니다.");
    }

    @Override
    public void createColleagues() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void mediate(String data, String user){
        System.out.println(">> " + user + "로부터 메시지를 받았습니다.");

        for (Colleague c : colleagues){
            System.out.println("<< " + c.getName());
            c.message(data);
        }
    }
}
