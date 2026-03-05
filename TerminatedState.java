class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread Finished");
    }
}
public class TerminatedState
{
    public static void main(String args[])
    {
        MyThread2 t1 = new MyThread2();
        t1.start();
        try
        {
            t1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread Interrupted: " + e.getMessage());
        }
        System.out.println("State After Termination: " + t1.getState());
    }
}