package com.fan1tuan.client.user.business.test;

import com.fan1tuan.business.support.StatusAwareResult;
import com.fan1tuan.client.user.business.UserService;
import com.fan1tuan.config.Fan1TuanConfig;
import com.fan1tuan.pojos.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Li He on 2014/4/22.
 * @author Li He
 */

public class UserServiceTest {
    @Test
    public void test(){
        System.setProperty("path.log", Fan1TuanConfig.getProperty("path.log"));

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");

        UserService userService = context.getBean("userService",UserService.class);

        StatusAwareResult<User> result = userService.test();

        System.out.println(result);

        System.out.println(result.getRet().toJSON());
    }
}