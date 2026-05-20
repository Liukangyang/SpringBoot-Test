package org.example.mybatisplus;

import org.example.mybatisplus.entity.User;
import org.example.mybatisplus.mapper.UserMapper;
import org.example.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MybatisplusApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectList(){
        userMapper.selectList(null).forEach(System.out::println);
    }

/*baseMapper接口测试
*
 */
    //插入
    @Test
    public void insertTest(){
        User user = new User(null,"LKY",27,"abc849589246@126.com",0);
        int r = userMapper.insert(user);
        System.out.println(r);
        System.out.println("自动获取user_id："+user.getId());
    }

    //删除
    @Test
    public void testDeleteById(){
        int r = userMapper.deleteById(2056725955890356226L);
        System.out.println("受影响行数："+r);
    }

    //通过map条件删除
    @Test
    public void testDeleteByMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("age",20);
        map.put("name","Jack");
        int r = userMapper.deleteByMap(map);
        System.out.println("受影响行数："+r);

    }

    //更新
    @Test
    public void testUpdateById(){
        User user = new User(4L,"admin",20,null,0);
        int r  = userMapper.updateById(user);
        System.out.println("受影响行数："+r);
    }

    //根据map条件查询
    @Test
    public void testSelectByMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("age",18);
        map.put("user_name","Jone");
        List<User> userlist = userMapper.selectByMap(map);
        userlist.forEach(System.out::println);

    }

    //服务层接口测试
    @Test
    public void testService(){
        long count = userService.count();
        System.out.println("总记录数："+ count);
    }


}
