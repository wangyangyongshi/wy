package com.page.service.serviceImpl;

import com.page.service.Strategy;
import org.springframework.stereotype.Service;

/**
 * @author 王二小
 * @date 2019/7/28 16:30
 */
@Service
public class NormalStrategy implements Strategy {

    @Override
    public void run() {
        System.out.println("normal================");

    }
}
