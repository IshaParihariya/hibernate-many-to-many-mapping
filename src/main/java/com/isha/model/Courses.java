package com.isha.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses
{
    @Id
    @Column(name="course_id")
    private Integer cid;
    @Column(name="couese_name")
    private String cname;
    @Column(name="course_price")
    private Integer cprice;

    // zero param constructor
    public Courses()
    {
        System.out.println("zero param constructor of Courses");
    }

    // getters and setters
    public Integer getcid()
    {
        return cid;
    }

    public void setcid(Integer cid)
    {
        this.cid = cid;
    }

    public String getcname()
    {
        return cname;
    }

    public void setcname(String cname)
    {
        this.cname = cname;
    }
    public Integer getcprice()
    {
        return cprice;
    }

    public void setcprice(Integer cprice)
    {
        this.cprice = cprice;
    }

    @Override
    public String toString()
    {
        return "Courses{" +
                "cid=" + cid + "cname = "+ cname+
                ", cprice=" + cprice +
                '}';
    }

}
