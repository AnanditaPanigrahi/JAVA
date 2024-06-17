class aroplane2 
{
    final void sleep(){
        System.out.println("animal is sleeping");
    }
}
class cargoplane2 extends aroplane2 {
    
}
public class finalkeyword {
    public static void main(String[] args) {
        aroplane2 a = new cargoplane2();
        a.sleep();
    }
}
