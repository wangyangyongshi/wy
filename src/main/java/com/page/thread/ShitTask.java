package com.page.thread;

/**
 * Created by wangyang on 2019/5/16.
 */
public class ShitTask implements Runnable {
    private Washroom washroom;

    private String name;

    public ShitTask(Washroom washroom, String name) {
        this.washroom = washroom;
        this.name = name;
    }

    public void run() {
        synchronized (washroom.getLock()) {
            System.out.println(name + " 获取了厕所的锁");
            while (!washroom.isAvailable()) {
                //一直等
                try {
                    washroom.getLock().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("拉完了=======");
        }
    }
}
