package com.page.DesignModel;

/**
 * Created by wangyang on 2019/5/16.
 */
public class Singleton {

    private static Singleton singleton = null;

    public static Singleton getSingleton(Singleton singleton) {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }

            }
        }
        return singleton;
    }

}
