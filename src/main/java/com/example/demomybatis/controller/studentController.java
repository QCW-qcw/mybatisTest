package com.example.demomybatis.controller;

import com.example.demomybatis.model.Student;
import com.example.demomybatis.service.StudentService;
import com.example.demomybatis.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/get/{id}")
    public   Object getStudent(@PathVariable("id") int id){

        Student student = studentService.getStdent(id);
        return student;

    }

    @RequestMapping("/all")
    public  Object allStudent(){
        return studentService.allStudents();
    }


    @RequestMapping("/insert/{id}")
    public Student insertStudent(@PathVariable("id") Integer id){

       return  studentService.insertone(id);
    }

    @RequestMapping("/getname/{name}")
    public Student insertStudent(@PathVariable("name") String name){

        //studentService.insertone(new Student(id));

        return studentService.getname(name);
    }

    @RequestMapping("/test/{name}")
    public R test(@PathVariable("name") String name){

        //studentService.insertone(new Student(id));

        return studentService.test(name);
    }

    @RequestMapping("/test1/{name}")
    public R test01(@PathVariable("name") String name){

        //studentService.insertone(new Student(id));

        return studentService.testget(name);
    }


}
