package com.hc.ssm.crud.service;

import com.hc.ssm.crud.entity.Student;

import java.util.List;

public interface StudentService {
    int addStudent(String studentName, String studentClass);

    int deleteStudent(Long studentId);

    int updateStudent(Long studentId, String studentName, String studentClass);

    List<Student> queryAllStudent();

    Student queryStudentById(Long studentId);
}
