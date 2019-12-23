package com.pokaboo.gmall.user.mapper;


import com.pokaboo.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author pokab
 */
public interface UserMapper extends Mapper<UmsMember> {

    /**
     * 查询用户
     *
     * @param userName
     * @return
     */
    UmsMember findUser(String userName);
}
