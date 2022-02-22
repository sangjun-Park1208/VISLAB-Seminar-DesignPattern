package state;

public class Main {
    public static void main(String[] args) {
        State order = new StateOrder();
        State pay = new StatePay();
        State ordered = new StateOrdered();

        String [] menuName = {"Salad", "Fries", "Chicken", "Soda"};
        int [] prices = {2000, 2500, 10000, 1500};

        Menu menu = new Menu(menuName, prices);

        Order order1 = new Order(menu);
        order1.selectMenu(0);
        order1.selectMenu(1);
        order1.selectMenu(2);
        order1.selectMenu(3);
        order1.refund();
        order1.endOrder();
        order1.selectMenu(2);
        order1.pay(20000);
        order1.eat();
    }
}
