class A
{

}
class B
{

}
public class DeadLock
{
    static A objA = new A();
    static B objB = new B();
    public static void main(String args[])
    {
        Thread t1 = new Thread(() -> 
        {
            synchronized (objA)
            {
                System.out.println("Thread 1 locked ObjA");
                try
                {
                    Thread.sleep(10000);
                }
                catch(Exception e)
                {
                    System.out.println("Thread 1 waiting for ObjB");
                    synchronized(objB)
                    {
                        System.out.println("Thread 1 locked ObjB");
                    }
                }
            }
        });
            Thread t2 = new Thread(() -> 
        {
            synchronized (objB)
            {
                System.out.println("Thread 2 locked ObjB");
                try
                {
                    Thread.sleep(10000);
                }
                catch(Exception e)
                {
                    System.out.println("Thread 2 waiting for ObjA");
                    synchronized(objB)
                    {
                        System.out.println("Thread 2 locked ObjA");
                    }
                }
            }
        });
            t1.start();
            t2.start();
    }
}