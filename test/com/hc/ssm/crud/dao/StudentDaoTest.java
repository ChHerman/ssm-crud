package com.hc.ssm.crud.dao;

import com.hc.ssm.crud.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StudentDaoTest {
    @Resource
    private StudentDao studentDao;

    @Test
    public void testqueryAllStudent() {
        List<Student> students = studentDao.queryAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testqueryStudentById() {
        Long studentId = 1000L;
        Student student = studentDao.queryStudentById(studentId);
        System.out.println(student);
    }

    @Test
    public void testaddStudent() {
        String studentName = "Jack";
        String studentClass = "一年一班";
        int result = studentDao.addStudent(studentName, studentClass);
        System.out.println(result);
        List<Student> students = studentDao.queryAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testupdateStudent() {
        Long studentId = 1003L;
        String studentName = "Ben";
        String studentClass = "大一四班";
        int result = studentDao.updateStudent(studentId, studentName, studentClass);
        System.out.println(result);
        List<Student> students = studentDao.queryAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testdeleteStudentById() {
        Long studentId = 1003L;
        int result = studentDao.deleteStudentById(studentId);
        List<Student> students = studentDao.queryAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
