package com.zhaochengzhen.learn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
public class ImportResourcesTests {

    @Autowired
    private ConfigurableApplicationContext ioc;

    @Test
    public void run() {
        boolean isImport = ioc.containsBean("testBeanService");
        System.out.println(isImport);
    }
}
