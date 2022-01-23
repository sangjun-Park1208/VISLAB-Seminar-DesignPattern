import java.util.ArrayList;
import java.util.Iterator;

public class Store_B implements Aggregate { // 패션
    ArrayList<String> Customer_List;
    int index;

    Store_B(){
        Customer_List = new ArrayList<>();
        index = 0;
    }

    int getSize(){
        return Customer_List.size();
    }

    String getCustomer(int find){
        return Customer_List.get(find);
    }

    void addList(String name){
        this.Customer_List.add(name);
        index++;
    }

    @Override
    public Iterator iterator() {
        return new Store_B_Iterator(this);
    }
}
