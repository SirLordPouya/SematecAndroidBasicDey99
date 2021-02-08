package com.pouyaheydari.learning.sematecandroidbasicdey99;

public class TestThreadClass extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
    }
}
