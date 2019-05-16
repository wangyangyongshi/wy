package com.page.Test;

/**
 * Created by wangyang on 2019/5/16.
 */
public class TestAbc {

    public static void main(String[] args) {

        System.out.println(BX.c);
//        BX bx = new BX();
//        System.out.println(bx.c);
    }

}

class AX {

    static {
        System.out.println("A");
    }

}

class BX extends AX {
    static {
        System.out.println("B");
    }

    public final  static String c = "c";
}