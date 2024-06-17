import java.util.HashSet;
import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(1000);
        hs.add(200);
        hs.add(30);
        hs.add("pw");
        System.out.println(hs);

        LinkedHashSet s=new LinkedHashSet();
        s.add(1000);
        s.add(200);
        s.add(30);
        s.add("pw");
        System.out.println(s);
    }
}
