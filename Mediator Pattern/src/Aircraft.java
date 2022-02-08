public abstract class Aircraft {
    Mediator mediator;
    String name;

    Aircraft(Mediator mediator, String name){ // Colleague 를 상속한 서브 클래스에서 객체 생성 시 mediator 부착.
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String msg);
    abstract void receive(String msg, Aircraft aircraft);
}
