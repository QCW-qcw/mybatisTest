package com.example.demomybatis.service;

import com.example.demomybatis.dao.LabelSystemDao;
import com.example.demomybatis.model.LabelSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {
    @Autowired
   LabelSystemDao LabelSystemDao;

    public Object getall() {
        return LabelSystemDao.selectAll();
    }


    //判断标签体系是否已存在
    public boolean checkSystemExist(String labelName) {
        List<LabelSystem> oneLabelSystem = LabelSystemDao.getOneByName(labelName);
        if(oneLabelSystem.size() == 0){
            return false;
        }else{
            return true;
        }
    }
}
