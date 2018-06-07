package com.batcodes.springboot.studentservices.model.Controller;

import com.batcodes.springboot.studentservices.Service.StudentService;
import com.batcodes.springboot.studentservices.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentConroller {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/{studentId}/courses")
    public List<Course> retrieveCoursesForStudent(@PathVariable String studentId){
        return studentService.retrieveCourses(studentId);
    }

    @GetMapping("/students/{studentId}/courses/{courseId}")
    public Course retrieveDetailsForStudent(@PathVariable String studentId, @PathVariable String courseId){
        return studentService.retrieveCourse(studentId, courseId);
    }

}
