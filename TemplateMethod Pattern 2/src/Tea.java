public class Tea extends Hot_Beverage{
    @Override
    void brew() throws InterruptedException {
        System.out.println("차를 우려 내는 중..\n");
        Thread.sleep(500);
    }

    @Override
    void addCondiment() throws InterruptedException {
        System.out.println("레몬을 추가하는 중..\n");
        Thread.sleep(300);
    }
}
