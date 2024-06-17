class car{
    private engine eng;
    public car(engine eng)
    {
        this.eng=eng;
    }
    public void start(){
        eng.engineStart();
    }
}
class engine{
    public void engineStart(){
        System.out.println("Engine started");
    }
}
public class oops {
    public static void main(String[] args) {
engine e=new engine();
car c=new car(e);
c.start();
    }
}
