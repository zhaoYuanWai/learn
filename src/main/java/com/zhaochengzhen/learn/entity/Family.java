package com.zhaochengzhen.learn.entity;

import com.zhaochengzhen.learn.config.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@PropertySource(value = "classpath:family.yml", factory = MixPropertySourceFactory.class)
@ConfigurationProperties(prefix = "family")
@Component
public class Family {
    private String familyName;
    private Object father;
    private Object mother;
    private Object child;

}
