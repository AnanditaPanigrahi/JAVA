import java.util.*;

class student{
    private String name;
    private int id;

}
class employee{
    private String name;
    private int id;
}
public class generic1 {
    public static void main(String[] args) {
        Student st=new Student(null, 0, null);
        Student st1=new Student(null, 0, null);
        employee e=new employee();
        ArrayList al=new ArrayList<>();
        al.add(st);
        al.add(e);

    }
}
