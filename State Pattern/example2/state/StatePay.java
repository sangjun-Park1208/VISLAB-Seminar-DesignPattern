package state;

public class StatePay implements State{
    @Override
    public void selectMenu(Order order, int i) {
        System.out.println("Return to Order state!");
        System.out.println();

        order.setState(new StateOrder());
    }

    @Override
    public void endOrder(Order order) {
        System.out.println("You are already in pay state");
        System.out.println();

    }

    @Override
    public void pay(Order order, int payment) {
        if (order.getCost() <= payment){
            System.out.println("Payment success!");
            order.setState(new StateOrdered());
        }
        else{
            System.out.println("Payment failed. Not enough money!");
        }
        System.out.println();

    }

    @Override
    public void refund(Order order) {
        System.out.println("Please make a payment first!");
        System.out.println();

    }

    @Override
    public void eat(Order order) {
        System.out.println("Please make a payment first!");
        System.out.println();

    }
}
