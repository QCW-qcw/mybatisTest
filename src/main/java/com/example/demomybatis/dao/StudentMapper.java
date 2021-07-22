package com.example.demomybatis.dao;

import com.example.demomybatis.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    Student selectByPrimaryKey(Integer id);

    List<Student> selectAll();
    Student getname(String name);

    int updateByPrimaryKey(Student record);
}