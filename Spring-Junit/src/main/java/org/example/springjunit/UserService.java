package org.example.springjunit;


import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    public void add(){
        System.out.println("show add...");
    }
}
