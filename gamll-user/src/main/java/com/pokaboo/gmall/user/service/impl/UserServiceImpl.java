package com.pokaboo.gmall.user.service.impl;

import com.pokaboo.gmall.user.bean.UmsMember;
import com.pokaboo.gmall.user.mapper.UserMapper;
import com.pokaboo.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pokaboo
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UmsMember findUser(String userName) {
        return userMapper.findUser(userName);
    }
}
