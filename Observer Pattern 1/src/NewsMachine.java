import java.util.ArrayList;

public class NewsMachine implements Subject {
    private ArrayList<Observer> observers; // 구독중인 옵저버들을 관리하는 배열리스트 자료구조
    private String title; // 업데이트 받을 기사의 제목
    private String news; // 업데이트 받을 기사의 내용

    public NewsMachine(){
        observers = new ArrayList<>();
    } // 생성자

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    } // 관찰자를 목록에 추가
    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    } // 관찰자를 목록에서 제거

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(title, news);
        }
    } // 변경이 감지되면 배열리스트에 등록된 옵저버들에게 업데이트 사항을 알려줌

    void setNewsInfo(String title, String news){
        this.title = title;
        this.news = news;
        notifyObserver();
    } // 새로운 뉴스가 등록되는 순간 -> notifyObserver()를 통해 구독중인 옵저버들에게 상태변화를 알림

}
