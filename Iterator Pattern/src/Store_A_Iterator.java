import java.util.Iterator;

public class Store_A_Iterator implements Iterator {
    private Store_A store_a;
    private String customer_name;
    private int index;
    public Store_A_Iterator(Store_A store_a){
        this.store_a = store_a;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < store_a.getSize()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String next() {
        customer_name = store_a.getCustomer(index);
        index++;
        return customer_name;
    }
}
