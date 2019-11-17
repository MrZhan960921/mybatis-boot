package com.zcq.po;

import lombok.Data;

import java.util.Date;

/**
 * @Author: chaoqun
 * @Date: 2019/11/17 20:18
 */
@Data
public class StudentSelfCard {
    private Integer id;
    private Integer studentId;
    private String nativeStr;
    private Date issueDate;
    private Date endDate;
    private String note;
}
