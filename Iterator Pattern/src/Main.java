import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Store_A store_a1 = new Store_A(); // a1 매장에 방문한 손님
        store_a1.addList("Kevin");
        store_a1.addList("Richard");
        store_a1.addList("Anna");
        store_a1.addList("Henry");

        Store_B store_b1 = new Store_B(); // b1 매장에 방문한 손님
        store_b1.addList("Aron");
        store_b1.addList("Alice");
        store_b1.addList("Dorothy");
        store_b1.addList("Esther");

        String want_to_find = "Anna1";


        Iterator it_a = store_a1.iterator();
        Iterator it_b = store_b1.iterator();
        while (it_a.hasNext() || it_b.hasNext()){
            String customerName_a = (String) it_a.next();
            String customerName_b = (String) it_b.next();
            if(customerName_a == want_to_find){
                System.out.println("Here we find '" + customerName_a + "' in Store A.");
                break;
            }
            else if( customerName_b == want_to_find){
                System.out.println("Here we find '" + customerName_b + "' in Store B.");
                break;
            }
            if(!it_b.hasNext() && !it_a.hasNext() && ( customerName_a != want_to_find ) && ( customerName_b != want_to_find ) ){
                System.out.println("There is no '" + want_to_find + "' in Store A, B.");
            }
        }

    }
}
