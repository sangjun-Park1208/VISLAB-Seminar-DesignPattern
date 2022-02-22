package state;

public interface State {
    public abstract void selectMenu(Order order, int i);
    public abstract void endOrder(Order order);
    public abstract void pay(Order order, int payment);
    public abstract void refund(Order order);
    public abstract void eat(Order order);
}
