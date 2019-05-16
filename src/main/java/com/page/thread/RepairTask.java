package com.page.thread;

/**
 * Created by wangyang on 2019/5/16.
 */
public class RepairTask implements Runnable {
    private Washroom washroom;

    public RepairTask(Washroom washroom) {
        this.washroom = washroom;
    }

    public void run() {
        synchronized (washroom.getLock()){
            System.out.println("维修工获得了厕所的锁");
            System.out.println("维修中==========");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            washroom.setAvailable(true);
            washroom.getLock().notifyAll();
            System.out.println("厕所可以用了====");
        }
    }
}
