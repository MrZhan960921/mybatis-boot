package com.zcq.po;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: chaoqun
 * @Date: 2019/11/17 21:37
 */
@Data
public class StudentLecture {
    private Integer id;
    private Integer studentId;
    private Lecture lecture;
    private BigDecimal grade;
    private String note;
}
