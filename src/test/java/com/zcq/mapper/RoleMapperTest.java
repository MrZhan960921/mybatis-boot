package com.zcq.mapper;

import com.zcq.po.Role;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chaoqun
 * @Date: 2019/11/4 20:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleMapperTest {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void test() {
        Role role=new Role();
        role.setNote("1111111");
        role.setRoleName("zdada");
        roleMapper.insertRole(role);
    }
}
