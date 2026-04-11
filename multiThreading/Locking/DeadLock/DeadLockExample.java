package multiThreading.Locking.DeadLock;

// Shared resource #1
class Pen{

    // Pen wants to use Paper too while holding its own lock
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper");
        // Now it tries to call a synchronized method on Paper → potential deadlock here
        paper.finishWriting();
    }

    // Just a dummy synchronized method to complete writing
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

// Shared resource #2
class Paper{

    // Paper wants to use Pen too while holding its own lock
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen");
        // Now it tries to call a synchronized method on Pen → potential deadlock here
        pen.finishWriting();
    }

    // Just a dummy synchronized method to complete writing
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

// Task1 that first locks Pen, then tries to lock Paper
class Task1 implements Runnable{

    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    public void run(){
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
    }
}

// Task that first locks Paper, then tries to lock Pen
class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    public void run(){

        synchronized (pen){ // to lock the paper have to alredy lock on pen
            paper.writeWithPaperAndPen(pen);// thread2 locks paper and tries to lock pen
        }
    }
}

public class DeadLockExample {
    public static void main(String[] args) {
        // Create shared resources
        Pen pen = new Pen();
        Paper paper  = new Paper();

        // Thread-1 tries Pen → Paper
        Thread thread1 = new Thread(new Task1(pen,paper), "Thread-1");
        // Thread-2 tries Paper → Pen
        Thread thread2 = new Thread(new Task2(pen,paper), "Thread-2");

        // Both threads start at the same time
        // If unlucky, one locks Pen and waits for Paper, while the other locks Paper and waits for Pen
        // → DEADLOCK (both stuck forever)
        thread1.start();
        thread2.start();
    }
}
