package com.pockocmoc.hibernate_test_user;

import com.pockocmoc.hibernate_test_user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Добавление нового пользователя в бд.
public class TestWriteDB {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            User user = new User("SashokPushok", "Parol",
                    "aleksandr@gmail.com", "Sasha", "Nenashev");
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            System.out.println("Done!!!");
            System.out.println(user);

        } finally {
            factory.close();
        }

    }
}
