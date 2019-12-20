package com.pokaboo.gmall.user;

import com.pokaboo.gmall.user.bean.UmsMember;
import com.pokaboo.gmall.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GamllUserApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void findUser(){
        UmsMember umsMember = userService.findUser("test");
        System.out.println(umsMember.getPhone());
    }

    @Test
    public void contextLoads() {

    }

}

