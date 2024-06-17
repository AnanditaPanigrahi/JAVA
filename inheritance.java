class human
{
    private String name;
    int age;
    void sleep()
    {
        age=18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}
class student extends human
{
    void disp(){
        System.out.println("student age is:"+age);
        //System.out.println("student name is:"+name);
    }
}


public class inheritance 
{
    
    public static void main(String[] args) 
    {
        student st=new student();
        st.sleep();
        st.disp();
    }
}
