
import java.util.*;
import java.util.WeakHashMap;

class employrr{
    private String name;
    private int age;
    private String department;
    public employrr(String name,int age){
        this.name=name;
        this.age=age;
        this.department="HR";
    }
    public String toString(){
        return "Name: "+name+", Age: "+age+", Department: "+department;
    }
    @Override
    public void finalize(){
        System.out.println("clean up work GC beforee de allocating memory");
    }
}

public class map4 {
    public static void main(String[] args) {
        employrr e=new employrr("anandita", 171);
        WeakHashMap hm=new WeakHashMap();
        hm.put(e, "pooja");
        System.out.println(hm);
        e=null;
        System.gc();
        System.out.println(hm);
        System.out.println("last line");
    }
}
