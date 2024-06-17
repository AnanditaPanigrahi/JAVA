class demo1 implements Runnable
{
    public void run()
    {
        System.out.println("cild thread executing");
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("child thread interrupted");
        }
        System.out.println("child thread task completed");

    }
}

public class StateOfthread
{
    public static void main(String[] args) 
    {
        System.out.println("main thread started");
        demo1 d=new demo1();
        Thread t1=new Thread();
        t1.start();
    }
}
