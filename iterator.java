import java.util.*;
import java.util.Iterator;

import javax.swing.text.html.HTMLDocument.*;

public class iterator{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("pw");
        al.add("java");
        al.add("python");
        al.add("c++");
        System.out.println(al);

        for(int i=0;i<al.size();i++){
           //Object o=al.get(i);
            System.out.println(i);
        }

        for(Object o:al){
            System.out.println(o);
        }

        Iterator itr1=al.iterator();
        while(itr1.hasNext()){
            //Integer i=(Integer)itr1.next();
            System.out.println(itr1.next());
    }

    ListIterator r=al.listIterator();
    while(r.hasPrevious()){
        System.out.println(r.previous());
}
}
}