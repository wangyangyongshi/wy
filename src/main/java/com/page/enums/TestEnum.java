package com.page.enums;

import java.util.Optional;

/**
 * @author 王二小
 * @date 2019/7/28 16:50
 */
public class TestEnum {


    public static void main(String[] args) {

//        Strategy.valueOf("FAST").run();

        Integer user = 1;

        Optional<Integer> userOptional = Optional.ofNullable(user);
        userOptional.map(new ActionOne()).orElse(new ActionOne());
    }
}
