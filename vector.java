import java.util.Enumeration;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        System.out.println(v);

        Enumeration en=v.elements();
        while(en.hasMoreElements()){
            System.out.println(v);
    }
}
}
