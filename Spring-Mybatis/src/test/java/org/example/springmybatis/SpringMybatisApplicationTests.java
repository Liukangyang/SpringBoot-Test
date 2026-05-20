package org.example.springmybatis;

import org.example.springmybatis.mapper.UserMapper;
import org.example.springmybatis.domain.User;
import org.example.springmybatis.mapper.UserXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringMybatisApplicationTests {

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public UserXmlMapper userXmlMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testMybatis(){
        System.out.println("testMybatis");
        List<User> users= userMapper.findAll();
        users.forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    void testXml(){
        System.out.println("testXml");
        List<User> users = userXmlMapper.findAll();
        users.forEach(user -> {
            System.out.println(user);
        });
    }

}
