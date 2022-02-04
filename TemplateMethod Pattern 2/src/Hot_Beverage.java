import java.util.Scanner;

public abstract class Hot_Beverage {

    final void prepareRecipe() throws InterruptedException { // Template Method <- 알고리즘을 가지고 있음
        boilWater();
        brew();
        pourInCup();

        System.out.println("시즈닝을 추가하시겠습니까?\n(true / false)\n");
        Scanner sc = new Scanner(System.in);

        if(customerWantsCondiments(sc.nextBoolean())){
            addCondiment();
        }
        System.out.println("주문하신 음료 나왔습니다.\n=====================");
    }

    abstract void brew() throws InterruptedException;       // Hook Operation <- 서브 클래스에서 구현
    abstract void addCondiment() throws InterruptedException; // Hook Operation <- 서브 클래스에서 구현

    private void boilWater() throws InterruptedException {
        System.out.println("물 끓이는 중..\n");
        Thread.sleep(1000);
    }
    private void pourInCup() throws InterruptedException {
        System.out.println("컵에 따르는 중..\n");
        Thread.sleep(300);
    }
    private boolean customerWantsCondiments(boolean addOrNot) {
        return addOrNot;
    }
}
