package com.zcq.mapper;

import com.zcq.po.User;

/**
 * @Author: chaoqun
 * @Date: 2019/11/5 22:49
 */
public interface UserMapper {

    public User getUser(Long id);

    public int insertUser(User user);
}
