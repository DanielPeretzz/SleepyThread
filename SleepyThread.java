package com.homework.daniel.Threads;

public class SleepyThread extends Thread{
    private int rate;

    public SleepyThread(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("-- Running a new sleepy thread (name: " + Thread.currentThread().getName()+ " rate: "+ (getRate() / 1000) + " seconds) --");
        while (true) {
            System.out.println(Thread.currentThread().getName() + ": I'm awake!");
            try {
                Thread.sleep(rate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
