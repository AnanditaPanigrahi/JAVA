interface A
{
    void show();

    void abc();
}
interface X{
    void abc();
}
class B implements A,X
{
    public void show()
    {
        System.out.println("number");
    }
    public void abc()
    {
        System.out.println("ananan");
    }
}

public class InterfaceImplementation 
{
    public static void main(String[] args) 
    {
       A obj=new B();
       obj.show();
       obj.abc();
    }
}
