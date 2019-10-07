package com.hc.ssm.crud.dao;

import com.hc.ssm.crud.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> queryAllStudent();

    Student queryStudentById(Long studentId);

    int deleteStudentById(Long studentId);

    int updateStudent(@Param("studentId") Long studentId, @Param("studentName") String studentName, @Param("studentClass") String studentClass);

    int addStudent(@Param("studentName") String studentName, @Param("studentClass") String studentClass);
}
