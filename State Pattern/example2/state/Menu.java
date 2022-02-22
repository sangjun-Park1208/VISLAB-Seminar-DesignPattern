package state;

public class Menu {
    private String [] menu;
    private int [] prices;

    public Menu(String [] menu, int [] prices){
        this.menu = menu;
        this.prices = prices;
    }

    public void setMenuName(int i, String name){
        this.menu[i] = name;
    }

    public void setMenuPrice(int i, int price){
        this.prices[i] = price;
    }

    public String getMenuName(int i){
        return this.menu[i];
    }

    public int getMenuPrice(int i){
        return this.prices[i];
    }
}
