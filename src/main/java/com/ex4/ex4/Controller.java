package com.ex4.ex4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Controller {
    private static List<Student> stu=new ArrayList<Student>();
    @GetMapping
    public List<Student> disp()
    {
        return stu;
    }
    @PostMapping
    public Student add(@RequestBody Student student)
    {
        stu.add(student);
        return student;
    }

}
