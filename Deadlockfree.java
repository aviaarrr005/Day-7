class A1{}
class B1{}

public class Deadlockfree{
    static A1 objA = new A1();
    static B1 objB = new B1();
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
            synchronized (objA){
                synchronized(objB){
                    System.out.println("Thread 1 finished");
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (objB){
                synchronized(objA){
                    System.out.println("Thread 2 finished");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

//Explanation: In this code, we have two threads t1 and t2. Thread t1 locks objA and then locks objB, while thread t2 locks objB and then locks objA.
// Since both threads are locking the resources in the same order (objA followed by objB), they will not be waiting for each other to release the locks, and therefore, they will not be in a deadlock state. This allows both threads to complete their execution without any issues.