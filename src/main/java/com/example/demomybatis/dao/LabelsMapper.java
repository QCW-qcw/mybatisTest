package com.example.demomybatis.dao;

import com.example.demomybatis.model.Labels;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LabelsMapper {
    int deleteByPrimaryKey(Integer labelId);

    int insert(Labels record);

    Labels selectByPrimaryKey(Integer labelId);

    List<Labels> selectAll();

    int updateByPrimaryKey(Labels record);
}