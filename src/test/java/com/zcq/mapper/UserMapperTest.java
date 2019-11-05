package com.zcq.mapper;

import com.zcq.enums.Sex;
import com.zcq.po.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Author: chaoqun
 * @Date: 2019/11/4 20:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setUserName("zhangsan");
        user.setCnname("张三");
        user.setMobile("888888888");
        user.setEmail("zhangsan@163.com");
        user.setSex(Sex.MALE);
        user.setNote("hahaha ");
        user.setBirthday(new Date());
        userMapper.insertUser(user);
        System.out.println(userMapper.getUser(1L).getSex());
        Assert.assertEquals(userMapper.getUser(1L).getSex(), Sex.MALE);
    }
}
