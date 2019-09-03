package com.xzit.springboot;

public class Teacher {
    private int id;
    private String twno;
    private String name;
    private Department department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTwno() {
        return twno;
    }

    public void setTwno(String twno) {
        this.twno = twno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", twno='" + twno + '\'' +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
