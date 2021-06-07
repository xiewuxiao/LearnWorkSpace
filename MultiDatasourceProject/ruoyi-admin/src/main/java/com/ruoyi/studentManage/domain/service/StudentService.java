package com.ruoyi.studentManage.domain.service;

import com.ruoyi.studentManage.domain.entity.Student;

import java.util.List;

/**
 * Created by Ben on 2021/6/6.
 */
public interface StudentService {
    List<Student> getAllProvinceStudent_first();
    List<Student> getAllProvinceStudent_second();
    List<Student> getAllProvinceStudent_third();
    List<Student> getAllProvinceStudent_fouth();
    List<Student> getAllProvinceStudent_fifth();

    List<Student>  getAllProvinceStudent();
}
