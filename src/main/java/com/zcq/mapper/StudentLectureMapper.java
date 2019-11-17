package com.zcq.mapper;

import com.zcq.po.StudentLecture;

import java.util.List;

/**
 * @Author: chaoqun
 * @Date: 2019/11/17 21:40
 */
public interface StudentLectureMapper {

    List<StudentLecture> findStudentLectureByStudentId(Integer id);
}
