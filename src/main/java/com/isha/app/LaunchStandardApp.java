package com.isha.app;
;
import com.isha.model.Courses;
import com.isha.model.Students;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class LaunchStandardApp
{
    public static void main(String[] args)
    {
        Configuration config=new Configuration();
        config.configure();
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();
        boolean flag=false;
        Transaction transaction=null;

        // Courses object
        Courses c1=new Courses();
        c1.setcid(1);
        c1.setcname("JAVA");
        c1.setcprice(999);
        Courses c2=new Courses();
        c2.setcid(2);
        c2.setcname("Hibernate");
        c2.setcprice(599);
        Courses c3=new Courses();
        c3.setcid(3);
        c3.setcname("Servlet");
        c3.setcprice(399);

        // set
        Set<Courses> s1=new HashSet<>();
        s1.add(c1);
        s1.add(c2);
        s1.add(c3);

        Set<Courses> s2=new HashSet<>();
        s2.add(c1);
        s2.add(c2);

        // Students object
        Students sd1=new Students();
        sd1.setsid(1);
        sd1.setsName("Isha");
        sd1.setCourses(s1); // s1 : 3 courses will be assigned to this student
        Students sd2=new Students();
        sd2.setsid(2);
        sd2.setsName("Mohit");
        sd2.setCourses(s2); // 2 courses set s2
        Students sd3=new Students();
        sd3.setsid(3);
        sd3.setsName("Kunal");
        sd3.setCourses(s1); // 3 courses set s1
        // try catch blocks
        try
        {
            transaction=session.beginTransaction();
            session.persist(sd1); // saving all students
            session.persist(sd2);
            session.persist(sd3);
            flag=true;
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //finally block
        finally
        {
           if(flag==true)
           {
               transaction.commit(); // commit
           }
           else
           {
               transaction.rollback(); // rollback
           }
           session.close();
           sessionFactory.close();
        }
    }
}
