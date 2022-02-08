public class F22 extends Aircraft {

    F22(Mediator mediator, String name) {
        super(mediator, name);
    }


    @Override
    void send(String msg) {
        System.out.println(this.name + " has send message :\n" + msg);
        mediator.sendMessage(msg, this); // 관제탑으로 하여금 메세지를 보낼 수 있도록 함.
    }

    @Override
    void receive(String msg, Aircraft aircraft) {
        System.out.println(this.name + " has received message from " + aircraft.name + " :\n" + msg + "\n");
    }
}
