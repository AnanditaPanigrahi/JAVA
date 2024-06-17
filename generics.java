import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {
        String ar[]=new String[10];
        ar[0]="apple";
        ar[1]="banana";
        //ar[2]=23;
        String name1=ar[0];
        String name2=ar[1];
        ArrayList al=new ArrayList();
        al.add("anandita");
        al.add("anandita");
        al.add(23);

        String n1=(String)al.get(0);
        String n2=(String)al.get(1);
        //Object o=al.get(2);

    }
}
