import java.util.*;

public class map1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "rohan");
        map.put(2, "rahul");
        map.put(3, "annn");
        map.put(4, "gouri");
        System.out.println(map);
        System.out.println(map.get(4));
        Set set=map.keySet();
        Iterator itr=set.iterator();

        while (itr.hasNext()) {
            //System.out.println("key is "+itr.next());
            Integer i=(Integer)itr.next();
            System.out.println("key is "+i);
        }
        Collection values=map.values();
        Iterator itr2=values.iterator();
        while (itr2.hasNext()) {
            System.out.println("value is"+itr2.next());
        }
        Set es=map.entrySet();
        Iterator itr3=es.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

    
    }
}
