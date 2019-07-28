import com.page.dao.MovieDao;
import com.page.service.Strategy;
import com.page.service.serviceImpl.NormalStrategy;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 王二小
 * @date 2019/7/27 21:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:/spring-*.xml"})
public class Test {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private MovieDao movieDao;

    @org.junit.Test
    public void testApplicationCon() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring-*.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Integer one = movieDao.findOne();
        System.out.println(one);
        Object pageService = applicationContext.getBean("wangyang");
        System.out.println(pageService);
        System.out.println("====");
    }


    @org.junit.Test
    public void testStrategy() {
        Map map = new HashMap();
        //将容器中的bean放到一个map中
        Strategy strategy = applicationContext.getBean(NormalStrategy.class);
        strategy.run();

    }


}
