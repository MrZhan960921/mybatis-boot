package com.zcq.po;

import com.zcq.enums.Sex;
import lombok.Data;

import java.util.List;

/**
 * @Author: chaoqun
 * @Date: 2019/11/17 20:12
 */
@Data
public class Student {
    private Integer id;
    private String cnName;
    private Sex sex;
    private String selfCardNo;
    private String note;
    private StudentSelfCard studentSelfcard;

    private List<StudentLecture> studentLectureList;
}
