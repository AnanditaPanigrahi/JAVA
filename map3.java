import java.util.*;

public class map3 {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put(1, "rohit");
        ht.put(2, "rahul");
        ht.put(3, "raj");
       // ht.put(null, "anandita");

        ht.putIfAbsent(2, "rohan");
        System.out.println(ht);

        TreeMap tm=new TreeMap();
        tm.put(1, "rohit");
        tm.put(2, "rahul");
        tm.put(3, "raj");
        System.out.println(tm);
    }
}
