package com.page.enums;

/**
 * @author 王二小
 * @date 2019/7/28 16:46
 */
public enum Strategy {

    FAST {
        @Override
        void run() {
            System.out.println("fast======");
        }
    },
    NORMAL {
        @Override
        void run() {
            System.out.println("normal=====");
        }
    };
    abstract  void run();

}
