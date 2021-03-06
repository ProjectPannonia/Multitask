package com.company;

class TaskerThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("TaskerThread mellékszál: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class TaskerRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("TaskerRunnable mellékszál: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {

    public static void mainer(String[] args) {
	TaskerThread t1 = new TaskerThread();
	TaskerThread t2 = new TaskerThread();
	Thread t3 = new Thread(new TaskerRunnable());
	Thread t4 = new Thread(new TaskerRunnable());
	t1.start();
	t2.start();
	t3.run();
	t4.run();
    }
}
