package com.zcq.po;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @Author: chaoqun
 * @Date: 2019/11/4 20:34
 */
@Data
@Alias("role")
public class Role {
    private Long id;

    private String roleName;

    private String note;
}
