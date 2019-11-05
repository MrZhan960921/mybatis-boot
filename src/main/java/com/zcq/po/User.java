package com.zcq.po;

import com.zcq.enums.Sex;
import lombok.Data;

import java.util.Date;

/**
 * @Author: chaoqun
 * @Date: 2019/11/5 22:42
 */
@Data
public class User {

    private Long id;

    private String userName;

    private String cnname;

    private Date birthday;

    private Sex sex;

    private String email;

    private String mobile;

    private String note;


}
