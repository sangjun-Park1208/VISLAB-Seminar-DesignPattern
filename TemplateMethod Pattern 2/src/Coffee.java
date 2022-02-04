public class Coffee extends Hot_Beverage{
    @Override
    void brew() throws InterruptedException {
        System.out.println("필터로 커피를 우려 내는 중..\n");
        Thread.sleep(500);
    }

    @Override
    void addCondiment() throws InterruptedException {
        System.out.println("시럽을 추가하는 중..\n");
        Thread.sleep(300);
    }
}
