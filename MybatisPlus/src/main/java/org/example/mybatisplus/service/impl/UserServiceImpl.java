package org.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mybatisplus.entity.User;
import org.example.mybatisplus.mapper.UserMapper;
import org.example.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
