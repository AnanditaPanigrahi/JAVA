abstract class aroplane1 
{
    abstract public void takeoff() ;
    
    abstract public void fly() ;
    public void landing(){
        System.out.println("aeroplane is landing");
    }
}

class cargoplane1 extends aroplane1 {
    public void takeoff() 
    {
        System.out.println("The cargoplane1 is taking off");
    }
    public void fly() 
    {
        System.out.println("The cargoplane1 is flying");
    }
    public void alert(){
        System.out.println("alert--------");
    }
    
}

class passengerplane1 extends aroplane1 {
    public void takeoff() 
    {
        System.out.println("The passengerplane1 is taking off");
    }
    public void fly() 
    {
        System.out.println("The passengerplane1 is flying");
    }
    
}

public class abstraction {
    public static void main(String[] args) {
        aroplane1 ref1 = new cargoplane1();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();
        ((cargoplane1) ref1).alert();
        aroplane1 ref= new passengerplane1();
        ref.takeoff();
        ref.fly();
        ref.landing();
    }
}
