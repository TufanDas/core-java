package multiThreading.thread_comunication;

import javax.swing.*;

class SharedRecource{

    private int data;
    private boolean hasData;

    public synchronized void produce(int value){

        while(hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("produced "+value);
        notify();
    }

    public synchronized int consume(){

        while (!hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        notify();
        System.out.println("Consumed " + data);
        return data;
    }
}

class Producer implements  Runnable{

    private SharedRecource resource;

    public Producer(SharedRecource resource){
        this.resource = resource;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }

}

class Consumer implements  Runnable{

    private SharedRecource resource;

    public Consumer(SharedRecource resource){
        this.resource = resource;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}
public class ThreadCommunication {
    public static void main(String[] args) {

        SharedRecource resource = new SharedRecource();

        //creating a new threads of Producer
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();


    }
}
