import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println(al1.contains(200));
        int index=al1.indexOf(300);
        System.out.println(index);
        System.out.println(al1.size());
        al1.ensureCapacity(20);
        al1.trimToSize();
        System.out.println(al1.size());
        System.out.println("*************************************");
        // ArrayList al2=new ArrayList();
        // al2.add("pw skill");
        // al2.add(1);
        // al2.add('j');
        // al2.add(1.1);
        // System.out.println(al2);
        // System.out.println("*************************************");

        // al2.add(100);
        // System.out.println(al2);
        // System.out.println("*************************************");

        // ArrayList al3=new ArrayList();

        // al3.add(1);
        // al3.add(2);
        // al3.add(4);
        // System.out.println(al3);

        // System.out.println("after adding collection");
        // al3.addAll(al2);
        // System.out.println(al3);
    }
}
