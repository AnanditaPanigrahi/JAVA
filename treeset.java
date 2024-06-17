import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet as=new TreeSet();
        
        as.add(100000);
        as.add(200);
        as.add(30);
        as.add(40);
        System.out.println(as);
        System.out.println(as.ceiling(40));
        System.out.println(as.floor(40));
    }
}
