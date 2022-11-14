package org.example.controllers;

import org.example.model.*;

import java.util.List;

public class GroupCreator {
    public Group Create(Student headman, List<Student> group, String groupName){
        Group _group = new Group();
        _group.setHeadman(headman);
        _group.setGroupName(groupName);
        _group.setGroup(group);
        return _group;
    }
}
