package org.example.controllers;

import org.example.model.*;

public class StudentCreator {
    public Student Create(String last_name, String first_name, String parent_name, Sex sex){
        Student student = new Student();
        student.setFirst_name(first_name);
        student.setLast_name(last_name);
        student.setParent_name(parent_name);
        student.setSex(sex);
        return student;
    }
}
