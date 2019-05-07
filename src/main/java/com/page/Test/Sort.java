package com.page.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 王二小
 * @date 2019/5/7 22:34
 */
public class Sort {

    public static void main(String[] args) {
        int arrayInteger[] = {1, 5, 2, 3, 4, 6, 7, 5, 7};
        //倒序排列
        for (int i = 0; i < arrayInteger.length - 1; i++) {
            for (int j = 0; j < arrayInteger.length - 1 - i; j++) {
                if (arrayInteger[j] <= arrayInteger[j + 1]) {
                    int a = arrayInteger[j];
                    int b = arrayInteger[j + 1];
                    arrayInteger[j] = b;
                    arrayInteger[j + 1] = a;
                }
            }


        }

        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.println(arrayInteger[i]);
        }
    }

}
