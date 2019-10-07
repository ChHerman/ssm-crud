package com.hc.ssm.crud.web;

import com.hc.ssm.crud.entity.Student;
import com.hc.ssm.crud.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/ssm-crud")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Student> students = studentService.queryAllStudent();
        model.addAttribute("students", students);
        return "list";
    }

    @RequestMapping("/{studentId}/detail")
    public String detail(@PathVariable("studentId") Long studentId, Model model) {
        Student student = studentService.queryStudentById(studentId);
        model.addAttribute("student", student);
        return "detail";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@RequestParam("studentId") Long studentId,
                         @RequestParam("studentName") String studentName,
                         @RequestParam("studentClass") String studentClass) {

        studentService.updateStudent(studentId, studentName, studentClass);
        return "redirect:/ssm-crud/list";
    }

    @RequestMapping("/{studentId}/delete")
    public String delete(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/ssm-crud/list";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("studentName") String studentName,
                      @RequestParam("studentClass") String studentClass) {
        studentService.addStudent(studentName, studentClass);
        return "redirect:/ssm-crud/list";
    }

}
