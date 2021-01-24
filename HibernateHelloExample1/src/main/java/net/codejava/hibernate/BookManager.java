package net.codejava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
    protected static SessionFactory sessionFactory;
 
    protected void setup() {
        // code to load Hibernate Session factory
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    	        .configure() // configures settings from hibernate.cfg.xml
    	        .build();
    	try {
    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	    
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	    StandardServiceRegistryBuilder.destroy(registry);
    	}
    
    }
 
    protected void exit() {
        // code to close Hibernate Session factory
    	
    	sessionFactory.close();
    }
 
    protected void create() {
        // code to save a book
    	Book book = new Book();
    	book.setTitle("Effective Java");
    	book.setAuthor("Balguriswamy");
    	book.setPrice(20f);
    	
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(book);
    	session.getTransaction().commit();
    	session.close();
    }
 
    protected void read() {
        // code to get a book
    	Session session = sessionFactory.openSession();
    	long bookId = 1;
    	Book book = session.get(Book.class, bookId);
    	if(book!=null) {
    		System.out.println("Title: "+book.getTitle());
    		System.out.println("Author: "+book.getAuthor());
    		System.out.println("Price: "+book.getPrice());
    	}else {System.out.println("Book Could not be found");}
    	session.close();
    }
 
    protected void update() {
        // code to modify a book
    }
 
    protected void delete() {
        // code to remove a book
    }
 
    public static void main(String[] args) {
        // code to run the program
    	 BookManager manager = new BookManager();
		    manager.setup();
		    manager.read();
		    manager.exit();
		
    }
}