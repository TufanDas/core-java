package multiThreading.Synchronization;

public class Counter {

    private int count = 0;

    //synchronized method — ensures only one thread can access increment() at a time

//    public synchronized void increment(){
//        count++;
//    }

//synchronized block — does the same thing, but gives more control over what is synchronized
    public synchronized void increment() {

        // Synchronizing on 'this' object ensures thread-safe access to 'count'
        synchronized (this) {
            count++; // safely increment the counter
        }
    }

    public int getCount() {
        return count;
    }
}
