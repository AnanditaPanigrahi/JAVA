class demo1{
    void sleep(){
        System.out.println("dispmethod written in demo1");
    }
}
class demo2 extends demo1{

}
class demo3 extends demo1{

}
class demo4 extends demo1{
    
}

public class Hierarchialinheritance {
    public static void main(String[] args) {
        demo2 d =new demo2();
        d.sleep();
    }
}
