package com.example.demomybatis.dao;

import com.example.demomybatis.model.LabelSystem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LabelSystemDao {
    int deleteByPrimaryKey(Integer labelSystemId);

    int insert(LabelSystem record);

    LabelSystem selectByPrimaryKey(Integer labelSystemId);

    List<LabelSystem> selectAll();

    int updateByPrimaryKey(LabelSystem record);

    List<LabelSystem> getOneByName(String labelSystemName);
}