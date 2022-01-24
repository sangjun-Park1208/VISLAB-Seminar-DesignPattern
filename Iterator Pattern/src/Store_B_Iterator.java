import java.util.Iterator;

public class Store_B_Iterator implements Iterator {
    private Store_B store_b;
    private String customer_name;
    private int index;

    Store_B_Iterator(Store_B store_b){
        this.store_b = store_b;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < store_b.getSize()){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String next() {
        customer_name = store_b.getCustomer(index);
        index++;
        return customer_name;
    }
}
