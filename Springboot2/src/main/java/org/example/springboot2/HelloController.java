package org.example.springboot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //1.@Value导入配置文件内容
    @Value("${name}")
    String name;
    @Value("${person.name}")
    String Person_name;
    @Value("${person.age}")
    String Person_age;
    @Value("${address[0]}")
    String address;
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot!";
    }

    //2.使用env
    @Autowired
    public Environment env;

    //3.@ConfigurationProperties注解实现配置属性注入
    @Autowired
    Person person;

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);
        System.out.println(Person_name);
        System.out.println(Person_age);
        System.out.println(address);

        System.out.println(env.getProperty("money"));

        return "Hello Spring Boot Test!";
    }

    @RequestMapping("/hello3")
    public String helloPerson(){
        System.out.println(person);
        return "Hello Person!";
    }
}
