package Hibernate;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageThing {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageThing MT = new ManageThing();

      // add entries to database
      Integer thing1 = MT.addThing("Penguin Toy", 30);
      Integer thing2 = MT.addThing("Lion Toy", 11);
      Integer thing3 = MT.addThing("Puzzle", 5);

      // list entries
      MT.listThings();

      // delete the lion toy
      MT.deleteThing(thing2);
      
   // update the weight for the penguin toy
      MT.updateThing(thing1, 8);

      // display new list
      MT.listThings();
   }
   
   // create a new thing
   public Integer addThing(String name, int weight){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer thingNumber = null;
      
      try {
         tx = session.beginTransaction();
         Thing thing = new Thing(name, weight);
         thingNumber = (Integer) session.save(thing); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return thingNumber;
   }
   
   // read all the things
   public void listThings( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List things = session.createQuery("FROM Thing").list(); 
         for (Iterator iterator = things.iterator(); iterator.hasNext();){
            Thing thing = (Thing) iterator.next(); 
            System.out.print("First Name: " + thing.getName()); 
            System.out.println("  Weight: " + thing.getWeight()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   // update the weight of a thing
   public void updateThing(Integer ThingNumber, int weight ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Thing thing = (Thing)session.get(Thing.class, ThingNumber); 
         thing.setWeight( weight );
		 session.update(thing); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   // deleting method
   public void deleteThing(Integer ThingNumber){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Thing thing = (Thing)session.get(Thing.class, ThingNumber); 
         session.delete(thing); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
}
