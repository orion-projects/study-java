package org.example.spring.core.ioc;

import org.example.spring.bean.config.ConfigureBean;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration(classes = {ConfigureBean.class})
public class WebApplicationContextTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void root(){
        System.out.println(webApplicationContext.getBean("bean"));
        System.out.println(webApplicationContext.getBean("web"));
    }
}
