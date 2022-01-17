public class ShoppingMall_Subscriber implements Observer, DisplayMerchandise{
    Subject subject;

    String merchandise_title;
    int merchandise_price;
    String merchandise_detail;

    String myName;


    public ShoppingMall_Subscriber(Subject subject, String myName){
        this.subject = subject;
        this.myName = myName;
        subject.registerObserver(this); // 구독 목록에 추가하기
    } // 구독 옵저버 생성자로 새로운 객체들 찍어내기


    void unSubscribe(Subject subject){
        subject.removeObserver(this);
    } // 해당 옵저버를 관찰자 목록에서 삭제(구독 해제)

    @Override
    public void update(String title, int price, String detail) { // notifyObserver() 메소드에서 활용됨
        this.merchandise_title = title;
        this.merchandise_price = price;
        this.merchandise_detail = detail;
        display();
    }

    @Override
    public void display(){
        System.out.println("\n**** 새로운 상품 알림 **** (" + this.myName + "님)");
        System.out.println("상품명 : " + merchandise_title + "\n");
        System.out.println("가격 : " + merchandise_price + "원\n");
        System.out.println("상세 설명 : " + merchandise_detail + "\n\n");
    }

}
