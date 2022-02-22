package state;

public class StateOrdered implements State{
    @Override
    public void selectMenu(Order order, int i) {
        System.out.println("You can not change menu now!");
        System.out.println();

    }

    @Override
    public void endOrder(Order order) {
        System.out.println("You already ordered the menu!");
        System.out.println();

    }

    @Override
    public void pay(Order order, int payment) {
        System.out.println("You already payed!");
        System.out.println();

    }

    @Override
    public void refund(Order order) {
        System.out.println("refund success!");
        System.out.println();

        order.setState(new StateOrder());
    }

    @Override
    public void eat(Order order) {
        System.out.println("Enjoy your meal!");
        for (int i = 0; i < order.getOrderList().size(); i++){
            int menuIndex = order.getOrderList().get(i);
            System.out.println("Dish name: "+order.getMenu().getMenuName(menuIndex)+", cost: "+order.getMenu().getMenuPrice(menuIndex));
        }
        System.out.println("Total price: "+order.getCost());
        System.out.println();

    }
}
