//import java.util.Scanner;

public class Thread {
    public static void main(String[] args) {
        System.out.println("calculation task started");
        String name=Thread.currentThread().getName();
        System.out.println("the name of the thread"+name);
        System.out.println(Thread.currentThread().getPriority());
        // Scanner sc=new Scanner(System.in);
        // int num1=sc.nextInt();
        // System.out.println("calculation task ended");
        // System.out.println("*******************************");

        // System.out.println("printing task started");
        // System.out.println("printing task ended");
        // System.out.println("*******************************");

        // System.out.println("displaying task started");
        // System.out.println("displaying task ended");
        // System.out.println("*******************************");


    }

    static Object currentThread() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'currentThread'");
    }
}
