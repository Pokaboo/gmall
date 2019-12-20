package com.pokaboo.gmall.user.controller;


import com.pokaboo.gmall.user.bean.UmsMember;
import com.pokaboo.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pokaboo
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/getUser/{userName}")
    @ResponseBody
    public UmsMember getUserInfo(@PathVariable String userName){
        UmsMember umsMember = userService.findUser(userName);
        System.out.println(userName);
        System.out.println(umsMember.toString());
        return umsMember;
    }
}
