package state;

import java.util.ArrayList;

public class Order{
    private State state;
    private Menu menu;
    private ArrayList<Integer> orderList;
    private int cost;

    public Order(Menu menu){
        this.state = new StateOrder();
        this.menu = menu;
        this.orderList = new ArrayList<>();
        this.cost = 0;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addCost(int i){
        this.cost += this.menu.getMenuPrice(i);
        this.orderList.add(i);
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public ArrayList<Integer> getOrderList() {
        return orderList;
    }

    public void clearOrderList() {
        this.orderList = new ArrayList<>();
    }

    public void selectMenu(int i) {
        state.selectMenu(this, i);
    }

    public void endOrder() {
        state.endOrder(this);
    }

    public void pay(int payment) {
        state.pay(this, payment);
    }

    public void refund() {
        state.refund(this);
    }

    public void eat() {
        state.eat(this);
    }
}
