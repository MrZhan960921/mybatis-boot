package com.zcq.mapper;

import com.zcq.po.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: chaoqun
 * @Date: 2019/11/4 20:45
 */
//@Mapper
public interface RoleMapper {

    public Role getRole(@Param( "id") Long id);

    public List<Role> findRoleByMap(Map<String, String> params);

    public void insertRole(Role role);
}
