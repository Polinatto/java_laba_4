package org.example.controllers;

import org.example.model.*;

import java.util.List;

public class DepartmentCreator {
    public Department Create(Human headman, List<Group> groups, String departmentName){
        Department department = new Department();
        department.setHeadman(headman);
        department.setGroups(groups);
        department.setDepartmentName(departmentName);
        return department;
    }
}
