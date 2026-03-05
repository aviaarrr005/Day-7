class MyThread3 extends Thread
{
    public void run()
    {
        System.out.println(getName() + " started, State: " + getState() + ", ID: " + getId());
        Thread.yield();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " finished, state: " + getState());
    }
    
}
public class ThreadMethods
{
    public static void main(String args[])
    {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        System.out.println("Before start, t1 is Alive or Not: " + t1.isAlive());

        System.out.println("t1 name: " + t1.getName() + ", state: " + t1.getState() + ", id: " + t1.getId());
        System.out.println("t2 name: " + t2.getName() + ", state: " + t2.getState() + ", id: " + t2.getId());
        
        t1.start();
        t2.start();

        try 
        {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Main thread interrupted");
        }

        System.out.println("t1 final state: " + t1.getState());
        System.out.println("t2 final state: " + t2.getState());
        System.out.println("CHeck t1 is Alive or Not: " + t1.isAlive());
        System.out.println("Check t2 is Alive or Not: " + t2.isAlive());
    }
}