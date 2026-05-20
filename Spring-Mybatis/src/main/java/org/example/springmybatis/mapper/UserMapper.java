package org.example.springmybatis.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.springmybatis.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//数据表接口类
@Mapper
@Repository
public interface UserMapper {
    //注解开发
    @Select("select * from t_user")
    List<User> findAll();

}
