public class AirBus320 extends Aircraft {

    AirBus320(Mediator mediator, String name) {
        super(mediator, name);
    }


    @Override
    void sendToAll(String msg) {
        System.out.println(this.name + " has send message :\n" + msg);
        mediator.sendtoAllMessage(msg, this); // 관제탑으로 하여금 메세지를 보낼 수 있도록 함.
    }

    @Override
    void receive(String msg, Aircraft aircraft) {
        System.out.println(aircraft.name + " has received message from " + this.name + " :\n" + msg + "\n"); // aircraft.name, this.name 수정
    }

    @Override
    void send(Aircraft from, String msg, Aircraft aircraft) { // from 추가
        System.out.println(this.name + " has send message to " + aircraft.name + ":\n" + msg);
        mediator.sendMessage(from, msg, aircraft);
    }
}
