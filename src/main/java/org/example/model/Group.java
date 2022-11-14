package org.example.model;

import java.util.List;

public class Group {
    private Student headman;
    private List<Student> group;
    private String groupName;

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student getHeadman() {
        return headman;
    }

    public void setHeadman(Student headman) {
        this.headman = headman;
    }

    @Override
    public String toString() {
        return String.format("Group name - %s. Headman - %s. Group:\n %s", groupName, headman, group.toString());
    }

    @Override
    public boolean equals(Object o) {
        Group _group = (Group) o;
        if (o == this) {
            return true;
        }
        return headman.equals(_group.headman)
                && group.equals(_group.group)
                && groupName.equals(_group.groupName);
    }
}
