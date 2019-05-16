package com.page.DesignModel;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangyang on 2019/5/16.
 */
public class TestSynchronizedThis {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();
        final CountDownLatch cdOrder = new CountDownLatch(1);
        final CountDownLatch cdAnswer = new CountDownLatch(3);

        final SynchonizedClass sc = new SynchonizedClass();
        for (int i = 0; i < 3; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        cdOrder.await(); //线程阻塞，等待主线程中执行cdOrder.countDown();
                        sc.started();
                        cdAnswer.countDown();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);   //线程池执行其中的线程
        }
        try {
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println("线程" + Thread.currentThread().getName() +
                    "发布执行命令");
            cdOrder.countDown(); //让线程池中的线程得以执行，下面主要是统计线程池中的线程得执行时间
            long beginTime = System.currentTimeMillis();
            System.out.println("线程" + Thread.currentThread().getName() +
                    "已经发送命令，正在等待结果");
            cdAnswer.await();  //等待线程池中的线程执行完毕
            System.out.println("线程" + Thread.currentThread().getName() +
                    "已收到所有响应结果,所用时间为：" + (System.currentTimeMillis() - beginTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}

class SynchonizedClass {

    public void started() throws InterruptedException {
        Thread.sleep(100);//1
        synchronized (this) { //同步代码块
            //Thread.sleep(100);//2
            System.out.println("我运行使用了 10 ms");
        }
    }
}
