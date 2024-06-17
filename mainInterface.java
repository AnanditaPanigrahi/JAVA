 interface computer{
    void compilecode();
}

class laptop implements computer{
    public void compilecode(){
        System.out.println("Compiling code");
    }
}

class desktop implements computer{
    public void compilecode(){
        System.out.println("desktop code");
    }
}
class developer{
    
    public void buildapp(computer obj){
        System.out.println("Building the app");
        
        obj.compilecode();
    }
}

public class mainInterface {
    public static void main(String[] args) {
       // laptop obj =new laptop();
       computer obj=new laptop();
        developer dev=new developer();
        dev.buildapp(obj);
      
    }
}
