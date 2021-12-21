package com.homework.daniel;

import com.homework.daniel.Threads.SleepyThread;

public class Main {

    public static void main(String[] args) {
        SleepyThread sleepyThread0 = new SleepyThread(5000);
        SleepyThread sleepyThread1 = new SleepyThread(2000);
        sleepyThread0.start();
        sleepyThread1.start();

    }
}
