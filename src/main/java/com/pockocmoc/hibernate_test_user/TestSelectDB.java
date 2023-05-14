package com.pockocmoc.hibernate_test_user;

import com.pockocmoc.hibernate_test_user.entity.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSelectDB {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<User> users = session.createQuery("from User "
                    + "where firstName = 'Sasha'")
                    .getResultList();

            for (User u : users) {
                System.out.println(u.getUserName());
            }

            session.getTransaction().commit();
            System.out.println("Done!!!");
        } finally {
            factory.close();
        }
    }
}
