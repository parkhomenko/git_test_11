package com.courses.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        /*
        Student student = new Student();
        student.setFname("Jackie");
        student.setLname("Chan");
        student.setAge(50);

        session.save(student);
        */

        session.createNativeQuery("");

        Query query = session.createQuery("from Student");
        List<Student> students = query.getResultList();

        transaction.commit();

        session.close();
    }
}
