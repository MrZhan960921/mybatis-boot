package com.zcq.mapper;

import com.zcq.po.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: chaoqun
 * @Date: 2019/11/17 20:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test() {

        Student student = studentMapper.getStudent(1);
        System.out.println(student);
    }
}
