class A{
    public void show(){
        System.out.println("A show");
    }
    class B{
        public void display(){
            System.out.println("in display");
        }
    }
}
public class innerlambda {
    public static void main(String[] args) {
      A obj= new A();
      obj.show(); 
      A.B obj1=obj.new B(); 
      obj1.display();
    }
}
