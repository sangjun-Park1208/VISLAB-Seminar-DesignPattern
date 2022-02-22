package mediator;

public abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName(){
        return name;
    }

    public abstract void send(String data);

    public abstract void message(String data);
}
