class aroplane 
{
    public void takeoff() 
    {
        System.out.println("The airplane is taking off");
    }
}
class cargoplane extends aroplane 
{
    public void takeoff() 
    {
        System.out.println("The cargoplane is flying");
    }
}
public class override {
    public static void main(String[] args) {
        cargoplane c = new cargoplane();
        c.takeoff();
    }
}
