package org.serdarfirlayis;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        //Create the student object.
        Students user = new Students();
        user.setId(1);
        user.setName("Serdar Rasit");
        user.setSurname("Firlayis");

        Transaction tx = null;
        //Get the session object.
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            //Start hibernate session.
            tx = session.beginTransaction();

            //Insert a new student record in the database.
            session.save(user);

            //Commit hibernate transaction if no exception occurs.
            tx.commit();
            System.out.println("Saved Successfully.");
        } catch (HibernateException e) {
            if (tx != null) {
                //Roll back if any exception occurs.
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            //Close hibernate session.
            session.close();
        }
    }
}