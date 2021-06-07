package com.ruoyi.studentManage.domain.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.framework.datasource.DynamicDataSourceContextHolder;
import com.ruoyi.studentManage.domain.entity.Student;
import com.ruoyi.studentManage.domain.mapper.StudentMapper;
import com.ruoyi.studentManage.domain.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ben on 2021/6/6.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @DataSource(DataSourceType.MASTER)
    public List<Student> getAllProvinceStudent_first() {
        return studentMapper.getStudent();
    }

    @DataSource(DataSourceType.SLAVE)
    public List<Student> getAllProvinceStudent_second() {
        return studentMapper.getStudent();
    }

    @DataSource(DataSourceType.THIRD)
    public List<Student> getAllProvinceStudent_third() {
        return studentMapper.getStudent();
    }

    @DataSource(DataSourceType.FOUTH)
    public List<Student> getAllProvinceStudent_fouth() {
        return studentMapper.getStudent();
    }

    @Override
    @DataSource(DataSourceType.FIFTH)
    public List<Student> getAllProvinceStudent_fifth() {
        return studentMapper.getStudent();
    }

    @Override
    public List<Student> getAllProvinceStudent() {
        DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.MASTER.name());
        List<Student> db1 = studentMapper.getStudent();
        DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.SLAVE.name());
        List<Student> db2 = studentMapper.getStudent();
        DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.THIRD.name());
        List<Student> db3 = studentMapper.getStudent();
        DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.FOUTH.name());
        List<Student> db4 = studentMapper.getStudent();
        DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.FIFTH.name());
        List<Student> db5 = studentMapper.getStudent();
        db1.addAll(db2);
        db1.addAll(db3);
        db1.addAll(db4);
        db1.addAll(db5);
        System.out.println(db1.size());
        return db1;
    }


}
