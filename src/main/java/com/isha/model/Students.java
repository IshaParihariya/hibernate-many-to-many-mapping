package com.isha.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Students {
    @Id
    @Column(name = "student_id")
    private Integer sid;
    @Column(name = "student_name")
    private String sName;

    //many to many
    // many students -> many courses
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Courses> courses;

    // setter getter for this
    public Set<Courses> getCourses()
    {
        return courses;
    }
    public void setCourses(Set<Courses> courses)
    {
        this.courses=courses;
    }

    // zero param constructor
    public Students() {
        System.out.println("zero param constructor of Students");
    }

    // getter setter
    public Integer getsid() {
        return sid;
    }

    public void setsid(Integer sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Students [" +
                "sid=" + sid +
                ", sName= " + sName + "]" ;

    }
}