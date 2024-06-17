import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque ad1=new ArrayDeque();
        ad1.add(10);
        ad1.add(20);
        System.out.println(ad1);
        ad1.addFirst(100);
        ad1.addLast(200);
        System.out.println(ad1);

        ad1.offer(500);
        ad1.offerFirst(1);
        ad1.addLast(10);
        System.out.println(ad1);
    }
}
