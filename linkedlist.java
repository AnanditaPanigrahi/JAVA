import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add("apple");
        l1.add("banana");
        l1.add("cherry");
        System.out.println(l1);


        LinkedList l2=new LinkedList();
        l2.add(100);
        l2.add(200);
        l2.add(300);
        System.out.println(l2);

        LinkedList l3=new LinkedList();
        l3.add(10);
        l3.add(20);
        l3.add(30);
        System.out.println(l3);

        l3.addFirst("anandita");
        l3.addLast("pooja");
        System.out.println(l3);
        System.out.println(l3.peek());
        //System.out.println(l3.poll());
        System.out.println(l3);
    }
}
