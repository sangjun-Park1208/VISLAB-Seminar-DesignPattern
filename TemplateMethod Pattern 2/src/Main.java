public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hot_Beverage coffee = new Coffee();
        Hot_Beverage tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
