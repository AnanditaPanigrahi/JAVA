import java.util.ArrayList;
import java.util.Iterator;

public class failfast {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(12);
        al.add(23);
        al.add(34);
        System.out.println(al);
        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i));
        //     al.add(100);
        // }
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
