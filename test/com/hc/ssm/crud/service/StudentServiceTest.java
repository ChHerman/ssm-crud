package com.hc.ssm.crud.service;

import com.hc.ssm.crud.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class StudentServiceTest {
    @Resource
    private StudentService studentService;

    @Test
    public void testaddStudent() {
        String name = "July";
        String studentClass = "class 1";
        int result = studentService.addStudent(name, studentClass);
        List<Student> students = studentService.queryAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testupdateStudent() {
        Long id = 1004L;
        String name = "hh";
        String studentClass = "11";
        int result = studentService.updateStudent(id, name, studentClass);
        Student student = studentService.queryStudentById(id);
        System.out.println(student);
    }

    @Test
    public void testdeleteStudent() {
        Long id = 1004L;
        int result = studentService.deleteStudent(id);
        List<Student> students = studentService.queryAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
