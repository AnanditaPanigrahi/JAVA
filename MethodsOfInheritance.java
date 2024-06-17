class aroplane 
{
    public void takeoff() 
    {
        System.out.println("The airplane is taking off");
    }

    public void fly() 
    {
        System.out.println("The airplane is flying");
    }
}

class cargoplane extends aroplane {
    public void takeoff() 
    {
        System.out.println("The cargoplane is taking off");
    }
    public void fly() 
    {
        System.out.println("The cargoplane is flying");
    }
    
}

class passengerplane extends aroplane {
    public void takeoff() 
    {
        System.out.println("The passengerplane is taking off");
    }
    public void fly() 
    {
        System.out.println("The passengerplane is flying");
    }
    
}

class fighterplane extends aroplane {
    public void takeoff() 
    {
        System.out.println("The fighterplane is taking off");
    }
    public void fly() 
    {
        System.out.println("The fighterplane is flying");
    }
    
}
class airport{
    public void poly(aroplane ref){
        ref.takeoff();
        ref.fly();
        System.out.println("-----------------");
    }
}

class MethodsOfInheritance {
    public static void main(String[] args) {
        cargoplane c = new cargoplane();
        passengerplane p = new passengerplane();
        fighterplane f=new fighterplane();
        airport a=new airport();
        a.poly(c);
        a.poly(p);
        a.poly(f);
        // c.takeoff();
        // c.fly();
        // p.takeoff();
        // p.fly();
        // f.takeoff();
        // f.fly();
       
    }
}
