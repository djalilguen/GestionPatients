/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 1995089
 */
public class Connect {
    static SessionFactory sessionF = null;
    static Session session = null;
    
    public static Session startTransaction() {
        sessionF = new Configuration().configure("hibernate.cfg.xml").
                buildSessionFactory();
        
        session = sessionF.openSession();
        
        return session;
    }

    public static void finishTransaction() {
        session.close();
        sessionF.close();
    }
}
