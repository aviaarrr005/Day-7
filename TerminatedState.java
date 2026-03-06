class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread Finished");
    }
}

class TerminatedState{
    public static void main(String[] args){
        MyThread2 t1 = new MyThread2();
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted: "+t1.getState());
        }
    }
}

//Explaination:
// In this code, we have a class MyThread2 that extends the Thread class. The run() method is overridden to print "Thread Finished". 
// In the main method, we create an instance of MyThread2 and start the thread. We then call the join() method on the thread, 
// which causes the main thread to wait until t1 has finished executing. 
// If the thread is interrupted while waiting, it will catch the InterruptedException and print the state of the thread.