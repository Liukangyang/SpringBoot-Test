package org.example.springmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.springmybatis.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserXmlMapper {

    //XML方式
    List<User> findAll();
}
