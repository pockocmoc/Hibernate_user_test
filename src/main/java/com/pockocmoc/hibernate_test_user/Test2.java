package com.pockocmoc.hibernate_test_user;

import com.pockocmoc.hibernate_test_user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

//            Employee emp = new Employee("Elena", "Petrova", "Sales", 49000);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//            
//            int myId = emp.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            User user = session.get(User.class, 2);
            session.getTransaction().commit();
            System.out.println(user);
            
            System.out.println("Done!!!");

        } finally {
            factory.close();
        }

    }
}
