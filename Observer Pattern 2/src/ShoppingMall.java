import java.util.ArrayList;

public class ShoppingMall implements Subject{
    private ArrayList<Observer> observers; // 옵저버 목록은 쇼핑몰 관리자에 의해서만 관리 -> private
    private String merchandise_title;
    private int merchandise_price;
    private String merchandise_detail;

    public ShoppingMall(){
        observers = new ArrayList<>();
    } // 객체 생성 시 구독중인 옵저버들을 담을 배열리스트 생성

    void setMerchandise(String merchandise_title, int merchandise_price, String merchandise_detail){
        this.merchandise_title = merchandise_title;
        this.merchandise_price = merchandise_price;
        this.merchandise_detail = merchandise_detail;
        notifyObserver();
    } // 상품명, 가격, 상세설명을 설정하면(업데이트 하면) 구독중인 옵저버들에게 알림

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    } // 옵저버로 등록하기

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    } // 옵저버 목록에서 해제하기

    @Override
    public void notifyObserver() {
        for (Observer eachObserver : observers) {
            eachObserver.update(merchandise_title, merchandise_price, merchandise_detail);
        }
    } // 구독중인 모든 옵저버에게 업데이트 사항 알리기
}
