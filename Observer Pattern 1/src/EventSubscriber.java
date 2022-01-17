public class EventSubscriber implements Observer, DisplayNews{
    private String newsString;
    private Subject subject;

    public EventSubscriber(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display(){
        System.out.println("--- [This alarm is for Event Subscriber] ---");
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
