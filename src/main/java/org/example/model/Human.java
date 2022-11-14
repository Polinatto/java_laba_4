package org.example.model;

public class Human {
    private String last_name, first_name, parent_name;
    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("Last name - %s. First name - %s. Parent name - %s. Sex - %s", last_name, first_name, parent_name, sex);
    }

    @Override
    public boolean equals(Object o) {
        Human human = (Human) o;
        if (o == this) {
            return true;
        }
        return last_name.equals(human.last_name)
                && first_name.equals(human.first_name)
                && parent_name.equals(human.parent_name)
                && sex.equals(human.sex);
    }
}
