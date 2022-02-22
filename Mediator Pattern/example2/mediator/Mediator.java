package mediator;

import java.util.ArrayList;

public abstract class Mediator {
    protected ArrayList<Colleague> colleagues;

    public void addColleague(Colleague c){
        colleagues.add(c);
    }

    public abstract void createColleagues();

    public abstract void mediate(String data, String user);
}
