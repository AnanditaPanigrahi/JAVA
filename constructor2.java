class demo{
    private int a; 
    private String b;
    public demo(){
        System.out.println("zero parameter");
        b="anandita";
        a=20;
    }
    public demo(String b){
        this.b=b;
        a=19;
    }
    public demo(int a,String b){
        this.a=a;
        this.b=b;

    }
    public void disp(){
        System.out.println(a);
        System.out.println(b);
    }
    
}


public class constructor2 {
    public static void main(String[] args) {
        demo d = new demo(10,39);
        d.disp();
        demo d2=new demo(10,20);
        d2.disp();
    }
}
