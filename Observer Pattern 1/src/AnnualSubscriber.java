public class AnnualSubscriber implements Observer, DisplayNews{ // 정기 구독자 클래스
    private String newsString;
    private Subject subject;

    public AnnualSubscriber(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display(){
        System.out.println(newsString);
    }

    void unSubscribe(){
        subject.removeObserver(this);
    }

    @Override
    public void update(String title, String news) {
        newsString = "      <" + title + ">\n------------------------\n" + news;
        display();
    }
}
