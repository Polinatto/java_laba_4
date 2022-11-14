package org.example.test;

import com.google.gson.reflect.TypeToken;
import org.example.JsonManager.JsonManager;
import org.example.controllers.DepartmentCreator;
import org.example.controllers.GroupCreator;
import org.example.controllers.StudentCreator;
import org.example.controllers.UniversityCreator;
import org.example.model.*;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class JUnit {
    public static boolean jsonTest(){
        StudentCreator sc = new StudentCreator();
        Student student1 = sc.Create("last_name1", "first_name1", "parent1", Sex.male);
        Student student2 = sc.Create("last_name2", "first_name2", "parent2", Sex.female);
        Student student3 = sc.Create("last_name3", "first_name3", "parent3", Sex.female);
        Student student4 = sc.Create("last_name4", "first_name4", "parent4", Sex.male);
        Student student5 = sc.Create("last_name5", "first_name5", "parent5", Sex.female);
        Student student6 = sc.Create("last_name6", "first_name6", "parent6", Sex.male);
        Student student7 = sc.Create("last_name7", "first_name7", "parent7", Sex.female);
        Student student8 = sc.Create("last_name8", "first_name8", "parent8", Sex.male);

        GroupCreator gc = new GroupCreator();
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        Group group1 = gc.Create(student1, studentList, "124-19-1");

        studentList = new ArrayList<>();
        studentList.add(student3);
        studentList.add(student4);
        Group group2 = gc.Create(student1, studentList, "124-19-2");

        studentList = new ArrayList<>();
        studentList.add(student5);
        studentList.add(student6);
        Group group3 = gc.Create(student1, studentList, "124-19-3");

        studentList = new ArrayList<>();
        studentList.add(student7);
        studentList.add(student8);
        Group group4 = gc.Create(student1, studentList, "124-19-4");

        DepartmentCreator dc1 = new DepartmentCreator();
        ArrayList<Group> groupsList = new ArrayList<>();
        groupsList.add(group1);
        groupsList.add(group2);
        Human headman1 = sc.Create("last_name9", "first_name9", "parent9", Sex.male);
        Department department1 = dc1.Create(headman1, groupsList, "FIT");

        DepartmentCreator dc2 = new DepartmentCreator();
        groupsList = new ArrayList<>();
        groupsList.add(group3);
        groupsList.add(group4);
        Human headman2 = sc.Create("last_name10", "first_name10", "parent10", Sex.male);
        Department department2 = dc2.Create(headman2, groupsList, "ETF");

        UniversityCreator uc = new UniversityCreator();
        ArrayList<Department> departmentList = new ArrayList<>();
        departmentList.add(department1);
        departmentList.add(department2);
        Human rector = sc.Create("last_name11", "first_name11", "parent11", Sex.female);
        University university = uc.Create(rector, departmentList, "NTU DP");

        JsonManager<University> jsonManager = new JsonManager<>();
        String json = jsonManager.Serialize(university);
        Type type = new TypeToken<University>(){}.getType();
        University university2 = jsonManager.Deserialize(json, type);
        if(university.equals(university2)) {
            return true;
        }
        else {
            return false;
        }
    }
}
