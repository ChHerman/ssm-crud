package com.hc.ssm.crud.service.impl;

import com.hc.ssm.crud.dao.StudentDao;
import com.hc.ssm.crud.entity.Student;
import com.hc.ssm.crud.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(String studentName, String studentClass) {
        return studentDao.addStudent(studentName, studentClass);
    }

    @Override
    public int deleteStudent(Long studentId) {
        return studentDao.deleteStudentById(studentId);
    }

    @Override
    public int updateStudent(Long studentId, String studentName, String studentClass) {
        return studentDao.updateStudent(studentId, studentName, studentClass);
    }

    @Override
    public List<Student> queryAllStudent() {
        return studentDao.queryAllStudent();
    }

    @Override
    public Student queryStudentById(Long studentId) {
        return studentDao.queryStudentById(studentId);
    }
}
