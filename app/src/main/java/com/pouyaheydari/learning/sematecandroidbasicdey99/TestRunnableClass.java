package com.pouyaheydari.learning.sematecandroidbasicdey99;

public class TestRunnableClass implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
