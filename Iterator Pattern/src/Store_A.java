import java.util.Iterator;
import java.util.Stack;

public class Store_A implements Aggregate{ // 요식업
    Stack<String> Customer_List;
    int index;

    Store_A(){
        Customer_List = new Stack<>();
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
        return new Store_A_Iterator(this);
    }
}
