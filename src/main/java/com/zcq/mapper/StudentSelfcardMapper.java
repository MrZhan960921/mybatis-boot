package com.zcq.mapper;

import com.zcq.po.StudentSelfCard;

/**
 * @Author: chaoqun
 * @Date: 2019/11/17 20:20
 */
public interface StudentSelfcardMapper {
    StudentSelfCard findStudentSelfcardByStudentId(Integer studentId);
}
