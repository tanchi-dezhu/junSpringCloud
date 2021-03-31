package com.cloud.server.client.controller;

import com.cloud.server.client.entity.Student;
import com.cloud.server.client.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/insert")
    public void inert(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delelte(@PathVariable long id){
        studentRepository.deleteById(id);
    }

    @GetMapping("index")
    public String index(){
        return "当前端口号为+"+port;
    }
}
