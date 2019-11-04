package com.zcq.mapper;

import com.zcq.po.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: chaoqun
 * @Date: 2019/11/4 20:45
 */
//@Mapper
public interface RoleMapper {

    public Role getRole(@Param(value = "id") Long id);
}
