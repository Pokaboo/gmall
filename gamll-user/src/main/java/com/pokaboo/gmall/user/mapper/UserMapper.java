package com.pokaboo.gmall.user.mapper;

import com.pokaboo.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author pokab
 */
@Mapper
public interface UserMapper {

    /**
     * 查询用户
     * @param userName
     * @return
     */
    UmsMember findUser(String userName);
}
