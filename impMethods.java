/*
Important Thread METHODS:

1. start(): This method is used to start the execution of a thread. When a thread is started, it moves from the NEW state to the RUNNABLE state.
2. run(): This method contains the code that defines the behavior of the thread. It is called when the thread is started. You can override this method to specify what the thread should do when it runs.
3. sleep(long millis): This method is used to pause the execution of the current thread for a specified amount of time (in milliseconds). It can throw an InterruptedException if the thread is interrupted while sleeping.
4. join(): This method is used to wait for a thread to complete its execution. When you call join() on a thread, the calling thread will be blocked 
   until the thread on which join() was called has finished executing. It can also throw an InterruptedException if the waiting thread is interrupted.
5.isAlive(): This method is used to check if a thread is still alive (i.e., it has not yet completed its execution). It returns true if the thread is alive and false otherwise.
6. getState(): This method is used to get the current state of a thread. It returns an enum value of type Thread.State, which can be NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, or TERMINATED.
7. yield(): This method is used to pause the execution of the current thread and allow other threads to execute. It is a static method that can be called from any thread. When a thread calls yield(), 
it moves from the RUNNING state to the RUNNABLE state, allowing other threads to run.
 */

class MyThread extends Thread{

    public void run(){
    System.out.println(getName()+" Started");
    //Yield control to give other thread a chance
    Thread.yield();
    try{
        Thread.sleep(1200);
    }catch(InterruptedException e){
        System.out.println(getName() + " interrupted: "+e.getMessage());
    }
    System.out.println(getName()+ ": finished, state: " + getState());
    }
}
public class impMethods{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Before start, t1 is Alive or not : "+t1.isAlive());

        t1.start();
        t2.start();

        System.out.println("After start t1 = "+t1.getState());
        System.out.println("After start t2 = "+t2.getState());

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println("Main Thread interrupted "+e.getMessage());
        }

        System.out.println("After join t1 = "+t1.getState());
        System.out.println("After join t2 = "+t2.getState());
        System.out.println("IS T1 ALIVEEE = "+t1.isAlive());
        System.out.println("IS T2 ALIVEEE = "+t2.isAlive());
    }
}

//Thread.yield() -> it only hints to thread schedular/only request
//priority basis -> can only request but doesnt gurantee that current thread will stop or pause
//Main decider -> JVM and OS decides which thread gest paused
