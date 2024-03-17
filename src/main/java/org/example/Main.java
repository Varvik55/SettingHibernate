package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

         SessionFactory sessionFactory =   new Configuration().buildSessionFactory();
         Session session = sessionFactory.openSession();
        System.out.println(session.isOpen());

        sessionFactory.close();
    }
}