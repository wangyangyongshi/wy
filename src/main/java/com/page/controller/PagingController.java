package com.page.controller;

import com.page.Entity.Movie;
import com.page.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author 王二小
 * @date 2019/3/26 22:52
 */
@Controller
public class PagingController {

    @Autowired
    private MovieDao movieDao;
    @RequestMapping("/getBean")
    public ModelAndView getBean() {
        PageBean pageBean = new PageBean(1, 2, 5);
        Integer id= movieDao.findOne();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(pageBean);
        modelAndView.setViewName("index");
        return modelAndView;

    }


}
