@FunctionalInterface
interface car {
    void accelerate(int avg,int time);
}

// class wagon implements car{
// public void accelerate(){
// System.out.println("Wagon is accelerating");
// }
// }
public class annonymosInner {
    public static void main(String[] args) {
        car obj = ( avg, time) ->System.out.println("Wagon is accelerating "+"at "+avg+" required time "+time);
        obj.accelerate(16,5);
    }
}
