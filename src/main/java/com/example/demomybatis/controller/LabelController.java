package com.example.demomybatis.controller;

import com.example.demomybatis.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabelController {

    @Autowired
    LabelService labelService;

    @RequestMapping("test")
    public Object test(){
        return labelService.getall();
    }

    @RequestMapping("getone/{name}")
    public Object getone(@PathVariable("name") String name){
        return labelService.checkSystemExist(name);
    }

}
