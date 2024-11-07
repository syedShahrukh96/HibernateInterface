package Com.shahrukh.hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class Employee1Main {
    public static void main(String[] args) {
    	
    	
    		//Loads Hibernate settings from hibernate.cfg.xml
    		Configuration cfg = new  Configuration().configure();
    		//Creates a SessionFactory, which manages database connections
    		SessionFactory factory = cfg.buildSessionFactory();
    		//Opens a Session to interact with the database.
    		Session session = factory.openSession();
    		//Starts a transaction to group operations together
    		Transaction tx = session.beginTransaction();
    		
    		
    		
    		
    		
    		FullTimeEmployee1 femp1 = new FullTimeEmployee1();
    		femp1.setName("Shahrukh");
    		femp1.setSalary(25000);
    		femp1.setBonus(2000);
    		session.persist(femp1);
    		
    		PartTimeEmployee1 pemp1 = new PartTimeEmployee1();
    		pemp1.setName("Raj");
    		pemp1.setSalary(24000);
    		pemp1.setHoursWorked(12);
    		session.persist(pemp1);
    		
    		
    	
    		System.out.println("Record Inserted Succesfully");
    		tx.commit();
    		session.close();
    		
    		
    		
    		
    	
    	
    	
    	
    }
}
