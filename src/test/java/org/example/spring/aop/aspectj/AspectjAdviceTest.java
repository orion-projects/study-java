package org.example.spring.aop.aspectj;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ConfigAspectj.class})
public class AspectjAdviceTest {

    @Test
    public void test(){

    }
}
