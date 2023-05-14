package com.pockocmoc.hibernate_test_user;

import com.pockocmoc.hibernate_test_user.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUpdateDB {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(100000 );
            session.createQuery("update User SET userName = 'Pushok' "
                    + "where firstName = 'Sasha'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!!!");

        } finally {
            factory.close();
        }

    }
}
