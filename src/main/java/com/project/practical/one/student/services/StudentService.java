package com.project.practical.one.student.services;

import com.project.practical.one.student.dao.StudentDao;
import com.project.practical.one.student.entity.Student;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class StudentService {
    private final StudentDao studentDao;
//add new student
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

    public Student findById(Integer id) {
        return studentDao.getOne(id);
    }

    public Student persist(Student student) {
        return studentDao.save(student);
    }
    public void deleteById(Integer id){
        studentDao.deleteById(id);//methanta void damme ai

    }
}