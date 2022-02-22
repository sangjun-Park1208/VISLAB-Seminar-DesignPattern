package state;

public class StateOrder implements State{
    @Override
    public void selectMenu(Order order, int i) {
        System.out.println("You select "+order.getMenu().getMenuName(i)+" price is "+order.getMenu().getMenuPrice(i));
        System.out.println();
        order.addCost(i);
    }

    @Override
    public void endOrder(Order order) {
        System.out.println("Menu select end!");
        order.setState(new StatePay());
        System.out.println();

    }

    @Override
    public void pay(Order order, int payment) {
        System.out.println("Please select menu first!");
        System.out.println();

    }

    @Override
    public void refund(Order order) {
        System.out.println("You are not payed yet!");
        System.out.println();

    }

    @Override
    public void eat(Order order) {
        System.out.println("Please select menu first!");
        System.out.println();

    }
}
