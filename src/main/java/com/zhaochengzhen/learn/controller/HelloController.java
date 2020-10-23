package com.zhaochengzhen.learn.controller;

import com.zhaochengzhen.learn.entity.AjaxResponse;
import com.zhaochengzhen.learn.entity.Family;
import com.zhaochengzhen.learn.entity.LombokPOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@RestController
public class HelloController {

    @Autowired
    private Family family;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String name) {
        // LombokPOJO pojo = LombokPOJO.builder().name("dsfasdf").age(23).build();
        //  System.out.println(pojo);
        System.out.println("dddddddddddd");
        System.out.println("dddddddddddd");
        System.out.println("dddddddddddd");
        System.out.println("11111111111");
        System.out.println("2222222222222");
        System.out.println("3333333333");
        LombokPOJO pojo = null;
        return "hello word " + name;
    }

    @RequestMapping(value = "/converter", method = RequestMethod.GET)
    public AjaxResponse converter(String name) {
        return AjaxResponse.success("dsfasdfasdddddddddddddddddddfasdf");
    }

    @RequestMapping(value = "/pro")
    public AjaxResponse pro() {
        System.out.println(family.getFamilyName());
        System.out.println(family);
        return AjaxResponse.success();
    }

}
