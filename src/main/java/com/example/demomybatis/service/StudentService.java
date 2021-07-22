package com.example.demomybatis.service;

import com.example.demomybatis.dao.StudentMapper;
import com.example.demomybatis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.demomybatis.utils.R;
@Service
public class StudentService {
    @Autowired
    public StudentMapper studentMapper;

    @Cacheable(value="StudentCache",key="#id")
    public Student getStdent(Integer id) {

        System.out.println("缓存执行啊啊啊");
        return studentMapper.selectByPrimaryKey(id);
    }


    public Object allStudents() {
        return studentMapper.selectAll();
    }

    @CachePut(value="StudentCache",key = "#id")
    public Student insertone(Integer id) {
        Student student  = new Student(id);
        studentMapper.insert(student);
        return student;
    }


    public Student getname(String name) {
        return studentMapper.getname(name);
    }



    @CachePut(value="StudentCache",key = "#name")
    public R test(String name) {
        return R.ok(name + "aaaa");
    }

    @Cacheable(value="StudentCache",key = "#name1")
    public R testget(String name1) {
        System.out.println("缓存执行嘛");

        return R.ok( name1 + "bbbb" );
    }
}
