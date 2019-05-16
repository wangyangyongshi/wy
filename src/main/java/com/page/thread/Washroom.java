package com.page.thread;

/**
 * Created by wangyang on 2019/5/15.
 */
public class Washroom {

    private volatile boolean isAvailable = false;

    private Object lock = new Object();

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public Object getLock() {
        return lock;
    }
}
