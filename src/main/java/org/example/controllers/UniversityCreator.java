package org.example.controllers;

import org.example.model.*;

import java.util.List;

public class UniversityCreator {
    public University Create(Human rector, List<Department> departments, String universityName){
        University university = new University();
        university.setRector(rector);
        university.setDepartments(departments);
        university.setUniversityName(universityName);
        return university;
    }
}
