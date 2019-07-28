package com.page.enums;

import java.util.function.Function;

/**
 * @author 王二小
 * @date 2019/7/28 17:02
 */
public class ActionOne implements Function {
    @Override
    public Object apply(Object o) {
        System.out.println("one=================");
        return null;
    }
}
