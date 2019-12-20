package com.pokaboo.gmall.user.service;

import com.pokaboo.gmall.user.bean.UmsMember;

/**
 * @author pokab
 */
public interface UserService {

    UmsMember findUser(String userName);
}
