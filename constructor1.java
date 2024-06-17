class demo{
    private int a; 
    private int b;
    public demo(){
        System.out.println("zero parameter");
    }
    public demo(int a,int b){
        this.a=a;
        this.b=b;

    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
    
}

public class constructor1 {
    public static void main(String[] args) {
        demo d = new demo(10,39);
        d.disp();
        demo d2=new demo(10,20);
        d2.disp();
    }
}
