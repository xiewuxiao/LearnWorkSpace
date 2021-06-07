package com.ruoyi.web.controller;

import com.alibaba.fastjson.JSON;
import com.ruoyi.studentManage.domain.entity.Student;
import com.ruoyi.studentManage.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Ben on 2021/6/6.
 */
@Controller
@RequestMapping("/student/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @ResponseBody
    @RequestMapping("/getAllProvinceStudent")
    public String getAllProvinceStudent(){
        List<Student> db1 = studentService.getAllProvinceStudent_first();
        List<Student> db2 = studentService.getAllProvinceStudent_second();
        List<Student> db3 = studentService.getAllProvinceStudent_third();
        List<Student> db4 = studentService.getAllProvinceStudent_fouth();
        List<Student> db5 = studentService.getAllProvinceStudent_fifth();

        db1.addAll(db2);
        db1.addAll(db3);
        db1.addAll(db4);
        db1.addAll(db5);
        System.out.println(db1.size());

        return JSON.toJSONString(db1);
    }
    @ResponseBody
    @RequestMapping("/getAllProvinceStudent_v1")
    public String getAllProvinceStudentV1(){

        return JSON.toJSONString(studentService.getAllProvinceStudent());
    }

}
