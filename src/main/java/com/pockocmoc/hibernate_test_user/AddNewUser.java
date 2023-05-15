package com.pockocmoc.hibernate_test_user;

import com.pockocmoc.hibernate_test_user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddNewUser {
    

    public void addUser(User user) {
        
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.save(user);

            session.getTransaction().commit();
            System.out.println("User added successfully!");
        } finally {
            factory.close();
        }
    }
    
    
}
