import java.util.Scanner;
abstract class shape{
    float area;
    abstract public void input();
    abstract public void computr();
    public void disp(){
        System.out.println("the area is:"+area);
    }
}
class rectangle extends shape{
    float length;
    float breadth;
 
    
    public void input(){
        System.out.println("calculation of rectanlge:");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length");
        length=scan.nextFloat();
        System.out.println("enter breadth");
        breadth=scan.nextFloat();
    }
    public void computr(){
        area=length*breadth;
    }
   
}

class square extends shape{
    float length;

    
    public void input(){
        System.out.println("calculation of square:");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length");
        length=scan.nextFloat();
        
    }
    public void computr(){
        area=length*length;
    }
    
}

class circle extends shape{
    float radius;

    
    public void input(){
        System.out.println("calculation of circle:");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter radius");
        radius=scan.nextFloat();
        
    }
    public void computr(){
        area=3.14f*radius*radius;
    }
}
   class geometry{
    public void poly(shape ref){
        ref.input();
        ref.computr();
        ref.disp();

    }
   }

public class area {
    public static void main(String[] args){
        rectangle r=new rectangle();
        square s=new square();
        circle c=new circle();
        geometry g=new geometry();
        g.poly(r);
        g.poly(s);
        g.poly(c);

    }

}


