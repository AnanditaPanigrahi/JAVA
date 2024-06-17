class demo1{
   int a,b;
   public demo1(){
    System.out.println("parent class constructotr");
   } 
   public demo1(int x,int y){
    System.out.println("parameterized parent class class constructor");
    a=x;
    b=y;
   }
}
class demo2 extends demo1{
    int c,d;
    public demo2(){
        this(10,20);
        System.out.println("child class constructotr");
       } 
       public demo2(int x,int y){
        System.out.println("parameterized parent child class constructor");
        c=x;
        d=y;
       }
}
public class constructorINinheritance {
    public static void main(String[] args) {
        demo2 d=new demo2();
    }
}
